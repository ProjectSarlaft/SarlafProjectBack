package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.servicios.ServiceImpacto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
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
    @DeleteMapping("/impacto/{impactoID}")
    @ResponseStatus(HttpStatus.OK)
    public void borrarImpacto(@PathVariable Long impactoID){
        servicioImpacto.borrarImpacto(impactoID);
    }

    @CrossOrigin
    @GetMapping("/impacto")
    @ResponseStatus(HttpStatus.OK)
    public List<ImpactoDTO> retornarImpactos(){
        return servicioImpacto.retornarImpactos();
    }

    //Method PUT
    // url /impacto
    // Request Body
    // if  verificar que la escala no este para otro id -> hago update
    // si no -> No actualizo mando mensaje la llave ya existe.

    @CrossOrigin
    @PutMapping("/impacto")
    @ResponseStatus(HttpStatus.OK)
    public ImpactoDTO actualizarImpacto(@RequestBody ImpactoDTO impactoDTO){
        return servicioImpacto.actualizarImpacto(impactoDTO);
    }
}
