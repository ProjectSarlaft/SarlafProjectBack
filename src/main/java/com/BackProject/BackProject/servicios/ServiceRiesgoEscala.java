package com.BackProject.BackProject.servicios;


import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;

import java.util.List;

public interface ServiceRiesgoEscala {
    List<RiesgoEscalaDTO> retornarRiesgoEscala();

    void borrarRiesgoEscala(String riesgoEscalaId);

    RiesgoEscalaDTO guardarRiesgoEscala(RiesgoEscalaDTO riesgoEscalaDTO);
}
