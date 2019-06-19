package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.entidades.Probabilidad;
import com.BackProject.BackProject.dominio.mapper.IdentificacionMapper;
import com.BackProject.BackProject.dominio.mapper.ProbabilidadMapper;
import com.BackProject.BackProject.repositorios.ProbabilidadRepositorio;

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
}
