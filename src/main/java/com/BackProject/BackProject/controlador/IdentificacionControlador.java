package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.IdentificationDTO;
import com.BackProject.BackProject.servicios.ServiceIdentificacion;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class IdentificacionControlador {
    private final ServiceIdentificacion servicioIdenficacion;

    public IdentificacionControlador(ServiceIdentificacion serviceIdentificacion) {
        this.servicioIdenficacion = serviceIdentificacion;
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public IdentificationDTO crearIdentificacion(@Valid @RequestBody IdentificationDTO identificationDTO){
        return servicioIdenficacion.saveIdentification(identificationDTO);
    }

    @CrossOrigin
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<IdentificationDTO> obtenerListaIdentificacion(){
        return servicioIdenficacion.obtenerRegistrosIdentificacion();
    }

}
