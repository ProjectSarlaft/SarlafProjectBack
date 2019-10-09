package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;

import java.util.List;

public interface ServiceRiesgo {

    List<RiesgoDTO> crearMatrizRiesgo();

    List<RiesgoEscalaDTO> retornarRiesgoEscala();

    void borrarRiesgoEscala(String riesgoEscalaId);

    RiesgoEscalaDTO guardarRiesgoEscala(RiesgoEscalaDTO riesgoEscalaDTO);
}
