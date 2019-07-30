package com.BackProject.BackProject.dominio.mapper;

import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.entidades.RiesgoEscala;
import org.springframework.stereotype.Component;

@Component
public class RiesgoEscalaMapper {

    public RiesgoEscala riesgoEscalaDtoToEntity(RiesgoEscalaDTO riesgoEscalaDTO) {
        RiesgoEscala riesgoEscala = new RiesgoEscala();
        riesgoEscala.setColor(riesgoEscalaDTO.getColor());
        riesgoEscala.setEscala(riesgoEscalaDTO.getEscala());

        return riesgoEscala;
    }

    public RiesgoEscalaDTO riesgoEscalaEntityToDto(RiesgoEscala riesgoEscala) {
        RiesgoEscalaDTO riesgoEscalaDTO = new RiesgoEscalaDTO();
        riesgoEscalaDTO.setEscala(riesgoEscala.getEscala());
        riesgoEscalaDTO.setColor(riesgoEscala.getColor());

        return riesgoEscalaDTO;
    }
}
