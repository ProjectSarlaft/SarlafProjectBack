package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.servicios.ServicioProbabilidad;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProbabilidadControlador {
    private final ServicioProbabilidad servicioProbabilidad;

    public ProbabilidadControlador(ServicioProbabilidad servicioProbabilidad) {
        this.servicioProbabilidad = servicioProbabilidad;
    }

    @CrossOrigin
    @PostMapping ("/probabilidad")
    @ResponseStatus (HttpStatus.CREATED)
    public ProbabilidadDTO crearProbabilidad(@Valid @RequestBody ProbabilidadDTO probabilidadDTO){
        return servicioProbabilidad.guardarProbabilidad(probabilidadDTO);
    }

    @CrossOrigin
    @DeleteMapping ("/probabilidad/{escala}")
    @ResponseStatus (HttpStatus.OK)
    // Asumiendo Escala como Primary Key
    public void borrarProbabilidad (@PathVariable String escala){
        servicioProbabilidad.borrarProbabilidad(escala);
    }
}
