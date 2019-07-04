package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.servicios.ServiceImpacto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class ImpactoControlador {
    private final ServiceImpacto servicioImpacto;

    public ImpactoControlador(ServiceImpacto servicioImpacto) {
        this.servicioImpacto = servicioImpacto;
    }

    @CrossOrigin
    @PostMapping("/impacto")
    @ResponseStatus(HttpStatus.CREATED)
    public ImpactoDTO crearImpacto(@Valid @RequestBody ImpactoDTO impactoDTO){
        return servicioImpacto.guardarImpacto(impactoDTO);
    }

    @CrossOrigin
    @DeleteMapping("/impacto/{escala}")
    @ResponseStatus(HttpStatus.OK)
    // Asumiendo Escala como Primary Key
    public void borrarImpacto(@PathVariable String escala){
        servicioImpacto.borrarImpacto(escala);
    }
}
