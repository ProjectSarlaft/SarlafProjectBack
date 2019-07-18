package com.BackProject.BackProject.orquestador;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.entidades.Impacto;
import com.BackProject.BackProject.dominio.entidades.Probabilidad;
import com.BackProject.BackProject.dominio.entidades.Riesgo;
import com.BackProject.BackProject.dominio.entidades.RiesgoId;
import com.BackProject.BackProject.dominio.mapper.ImpactoMapper;
import com.BackProject.BackProject.dominio.mapper.ProbabilidadMapper;
import com.BackProject.BackProject.repositorios.ImpactoRepositorio;
import com.BackProject.BackProject.repositorios.ProbabilidadRepositorio;
import com.BackProject.BackProject.utils.PlantillasMatrizRiesgo;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static com.BackProject.BackProject.utils.sorters.sorterUtils.organizarImpactos;
import static com.BackProject.BackProject.utils.sorters.sorterUtils.organizarProbabilidad;

@Configuration
public class RiesgoOrquestadorImpl implements RiesgoOrquestador {

    private final ImpactoRepositorio impactoRepositorio;
    private final ProbabilidadRepositorio probabilidadRepositorio;
    private final ImpactoMapper impactoMapper;
    private final ProbabilidadMapper probabilidadMapper;

    public RiesgoOrquestadorImpl(ImpactoRepositorio impactoRepositorio, ProbabilidadRepositorio probabilidadRepositorio, ImpactoMapper impactoMapper, ProbabilidadMapper probabilidadMapper) {
        this.impactoRepositorio = impactoRepositorio;
        this.probabilidadRepositorio = probabilidadRepositorio;
        this.impactoMapper = impactoMapper;
        this.probabilidadMapper = probabilidadMapper;
    }

    @Override
    public List<RiesgoDTO> creacionMatrizRiesgo() {

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
        List<RiesgoDTO> riesgos = new ArrayList<>();
        for (ImpactoDTO impacto: impactos) {
            for (ProbabilidadDTO probabilidad: probabilidades) {
                crearRegistroRiesgo(riesgos, impacto, probabilidad);
            }
        }

        // 4. Crear las plantillas.
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, impactos.size(), probabilidades.size());

        // Insertar en DB
        return riesgos;
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
