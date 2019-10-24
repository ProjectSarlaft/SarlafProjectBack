package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaIdDto;
import com.BackProject.BackProject.servicios.ServiceRiesgo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class RiesgoControlador {

    private final ServiceRiesgo serviceRiesgo;

    public RiesgoControlador(ServiceRiesgo serviceRiesgo) {
        this.serviceRiesgo = serviceRiesgo;
    }

    @CrossOrigin
    @GetMapping("/riesgo")
    @ResponseStatus(HttpStatus.OK)
    public List<RiesgoDTO> crearMatrizRiesgo(){
        return serviceRiesgo.crearMatrizRiesgo();

    }

}
