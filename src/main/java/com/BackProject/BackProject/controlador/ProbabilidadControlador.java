package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.servicios.ServicioProbabilidad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProbabilidadControlador {
    private final ServicioProbabilidad servicioProbabilidad;

    public ProbabilidadControlador(ServicioProbabilidad servicioProbabilidad) {
        this.servicioProbabilidad = servicioProbabilidad;
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus
    public ProbabilidadDTO crearProbabilidad(ProbabilidadDTO probabilidadDTO){
        return servicioProbabilidad.guardarProbabilidad(probabilidadDTO);
    }
}
