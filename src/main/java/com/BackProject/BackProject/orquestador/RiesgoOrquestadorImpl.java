package com.BackProject.BackProject.orquestador;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.entidades.Riesgo;
import com.BackProject.BackProject.dominio.mapper.ImpactoMapper;
import com.BackProject.BackProject.dominio.mapper.ProbabilidadMapper;
import com.BackProject.BackProject.dominio.mapper.RiesgoMapper;
import com.BackProject.BackProject.repositorios.ImpactoRepositorio;
import com.BackProject.BackProject.repositorios.ProbabilidadRepositorio;
import com.BackProject.BackProject.repositorios.RiesgoRepositorio;
import com.BackProject.BackProject.utils.PlantillasMatrizRiesgo;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.BackProject.BackProject.utils.sorters.sorterUtils.organizarImpactos;
import static com.BackProject.BackProject.utils.sorters.sorterUtils.organizarProbabilidad;

@Configuration
public class RiesgoOrquestadorImpl implements RiesgoOrquestador {

    private final ImpactoRepositorio impactoRepositorio;
    private final ProbabilidadRepositorio probabilidadRepositorio;
    private final RiesgoRepositorio riesgoRepositorio;

    private final ImpactoMapper impactoMapper;
    private final ProbabilidadMapper probabilidadMapper;
    private final RiesgoMapper riesgoMapper;

    public RiesgoOrquestadorImpl(ImpactoRepositorio impactoRepositorio, ProbabilidadRepositorio probabilidadRepositorio, RiesgoRepositorio riesgoRepositorio, ImpactoMapper impactoMapper, ProbabilidadMapper probabilidadMapper, RiesgoMapper riesgoMapper) {
        this.impactoRepositorio = impactoRepositorio;
        this.probabilidadRepositorio = probabilidadRepositorio;
        this.riesgoRepositorio = riesgoRepositorio;
        this.impactoMapper = impactoMapper;
        this.probabilidadMapper = probabilidadMapper;
        this.riesgoMapper = riesgoMapper;
    }

    @Override
    public List<RiesgoDTO> creacionMatrizRiesgo() {

        List<Riesgo> riesgos = riesgoRepositorio.findAll();
        if(riesgos.isEmpty()) {
            return crearMatrizRiesgos();
        } else {
            return riesgos.stream()
                    .map((riesgo) -> riesgoMapper.riesgoEntityToRiesgoDTO(riesgo))
                    .collect(Collectors.toList());
        }
    }

    private List<RiesgoDTO> crearMatrizRiesgos() {
        List<RiesgoDTO> riesgosDTO = new ArrayList<>();

        // 1. Recuperar Impactos DB
        List<ImpactoDTO> impactos =  impactoRepositorio.findAll()
                .stream()
                .map(impacto -> impactoMapper.impactoEntityToDTO(impacto))
                .sorted(organizarImpactos)
                .collect(Collectors.toList());

        // 2. Recuperar Probabilidad DB
        List<ProbabilidadDTO> probabilidades = probabilidadRepositorio.findAll()
                .stream()
                .map(probabilidad -> probabilidadMapper.probabilidadEntidadToDTO(probabilidad))
                .sorted(organizarProbabilidad)
                .collect(Collectors.toList());

        //todo Pasar a functional programming

        // 3. Crear Lista de riesgos con informacion de Probabilidad e Impacto

        for (ImpactoDTO impacto: impactos) {
            for (ProbabilidadDTO probabilidad: probabilidades) {
                crearRegistroRiesgo(riesgosDTO, impacto, probabilidad);
            }
        }

        // 4. Crear las plantillas.
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgosDTO, impactos.size(), probabilidades.size());

        // 5. Insertar en DB
        riesgosDTO.stream()
                .map((riesgo) -> riesgoMapper.riesgoDtoToEntity(riesgo))
                .forEach((riesgo) -> riesgoRepositorio.save(riesgo) );

        return riesgosDTO;
    }

    private void crearRegistroRiesgo(List<RiesgoDTO> riesgos, ImpactoDTO impacto, ProbabilidadDTO probabilidad) {
        RiesgoDTO riesgoDTO = new RiesgoDTO();
        riesgoDTO.setImpacto(impacto);
        riesgoDTO.setProbabilidad(probabilidad);
        riesgoDTO.setEscalaImpacto(impacto.getEscala());
        riesgoDTO.setEscalaProbabilidad(probabilidad.getEscala());
        riesgos.add(riesgoDTO);

    }
}
