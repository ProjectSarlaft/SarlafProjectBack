package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.entidades.Probabilidad;
import com.BackProject.BackProject.dominio.mapper.IdentificacionMapper;
import com.BackProject.BackProject.dominio.mapper.ProbabilidadMapper;
import com.BackProject.BackProject.exceptions.EmptyIdException;
import com.BackProject.BackProject.exceptions.InsercionProbabilidadException;
import com.BackProject.BackProject.exceptions.NoRegistroProbabilidadException;
import com.BackProject.BackProject.repositorios.ProbabilidadRepositorio;
import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServicioProbabilidadImpl implements ServicioProbabilidad {
    private final ProbabilidadMapper probabilidadMapper;
    private final ProbabilidadRepositorio probabilidadRepositorio;

    public ServicioProbabilidadImpl(ProbabilidadMapper probabilidadMapper, ProbabilidadRepositorio probabilidadRepositorio) {
        this.probabilidadMapper = probabilidadMapper;
        this.probabilidadRepositorio = probabilidadRepositorio;
    }


    @Override
    public ProbabilidadDTO guardarProbabilidad(ProbabilidadDTO probabilidadDTO) {
        Probabilidad probabilidad = probabilidadMapper.probabilidadDTOtoEntidad(probabilidadDTO);
        Probabilidad registroInsertadoProbabilidad = probabilidadRepositorio.save(probabilidad);
        return probabilidadMapper.probabilidadEntidadToDTO(probabilidad);
    }

    @Override
    public void borrarProbabilidad(Long escalaID) {
            probabilidadRepositorio.deleteById(escalaID);
    }

    @Override
    public List<ProbabilidadDTO> retornarProbabilidades() {
        return probabilidadRepositorio.findAll()
                .stream()
                .map((probabilidad) -> probabilidadMapper.probabilidadEntidadToDTO(probabilidad))
                .collect(Collectors.toList());
    }

    @Override
    public ProbabilidadDTO actualizarProbabilidad(ProbabilidadDTO probabilidadDTO) {
        if(escalaProbabilidadEnUso(probabilidadDTO)){
            throw new InsercionProbabilidadException();
        }
        Optional.of(probabilidadDTO.getId()).orElseThrow(() -> new EmptyIdException());

        Probabilidad probabilidad = probabilidadRepositorio.findById(probabilidadDTO.getId()).get();
        probabilidad.setEscala(probabilidadDTO.getEscala());
        probabilidad.setNivel(probabilidadDTO.getNivel());
        probabilidad.setPosibilidadAnual(probabilidadDTO.getPosibilidadAnual());
        Probabilidad probabilidadActualizada = probabilidadRepositorio.save(probabilidad);

        return probabilidadMapper.probabilidadEntidadToDTO(probabilidadActualizada);

    }

    private boolean escalaProbabilidadEnUso(ProbabilidadDTO probabilidadDTO){
        return !probabilidadRepositorio.findAll().stream()
                .noneMatch((probabilidad) -> probabilidad.getEscala().equals(probabilidadDTO.getEscala())
                && !probabilidad.getId().equals(probabilidadDTO.getId()));
    }
}
