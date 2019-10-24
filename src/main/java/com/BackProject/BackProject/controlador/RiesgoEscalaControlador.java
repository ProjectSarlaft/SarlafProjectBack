package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaIdDto;
import com.BackProject.BackProject.servicios.ServiceRiesgoEscala;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RiesgoEscalaControlador {

    private final ServiceRiesgoEscala serviceRiesgoEscala;

    public RiesgoEscalaControlador(ServiceRiesgoEscala serviceRiesgoEscala) {
        this.serviceRiesgoEscala = serviceRiesgoEscala;
    }

    @CrossOrigin
    @GetMapping("/riesgoEscala")
    @ResponseStatus(HttpStatus.OK)
    public List<RiesgoEscalaDTO> recuperarRiesgoEscala(){
        return serviceRiesgoEscala.retornarRiesgoEscala();
    }


    @CrossOrigin
    @DeleteMapping("/riesgoEscala/{riesgoEscalaId}")
    @ResponseStatus(HttpStatus.OK)
    public void borrarRiesgoEscala(@Valid @RequestBody RiesgoEscalaIdDto riesgoEscalaIdDto){
        serviceRiesgoEscala.borrarRiesgoEscala(riesgoEscalaIdDto.getRiesgoEscalaId());
    }

    @CrossOrigin
    @PostMapping("/riesgoEscala")
    @ResponseStatus(HttpStatus.CREATED)
    public RiesgoEscalaDTO crearRiesgoEscala(@Valid @RequestBody RiesgoEscalaDTO riesgoEscalaDTO){
        return serviceRiesgoEscala.guardarRiesgoEscala(riesgoEscalaDTO);
    }
}
