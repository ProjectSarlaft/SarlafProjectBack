package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;

import java.util.List;

public interface ServicioProbabilidad {
    ProbabilidadDTO guardarProbabilidad(ProbabilidadDTO probabilidad);

    void borrarProbabilidad(Long escala);

    List<ProbabilidadDTO> retornarProbabilidades();

    ProbabilidadDTO actualizarProbabilidad(ProbabilidadDTO probabilidadDTO);
}
