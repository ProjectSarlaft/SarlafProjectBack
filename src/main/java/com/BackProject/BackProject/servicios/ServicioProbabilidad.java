package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;

public interface ServicioProbabilidad {
    ProbabilidadDTO guardarProbabilidad(ProbabilidadDTO probabilidad);

    void borrarProbabilidad(String escala);
}
