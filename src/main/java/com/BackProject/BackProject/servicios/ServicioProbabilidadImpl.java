package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.entidades.Probabilidad;
import com.BackProject.BackProject.dominio.mapper.IdentificacionMapper;
import com.BackProject.BackProject.dominio.mapper.ProbabilidadMapper;
import com.BackProject.BackProject.exceptions.NoRegistroProbabilidadException;
import com.BackProject.BackProject.repositorios.ProbabilidadRepositorio;
import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.stereotype.Service;

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
    public void borrarProbabilidad(String escala) {
        try {
            probabilidadRepositorio.existsById(escala);
        } catch (CommandAcceptanceException e) {
            throw new NoRegistroProbabilidadException("No se encontró registro solicitado");
        }
    }
}
