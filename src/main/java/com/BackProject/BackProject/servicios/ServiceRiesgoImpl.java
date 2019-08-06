package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.orquestador.RiesgoOrquestador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRiesgoImpl implements ServiceRiesgo {

    private final RiesgoOrquestador riesgoOrquestador;

    public ServiceRiesgoImpl(RiesgoOrquestador riesgoOrquestador) {
        this.riesgoOrquestador = riesgoOrquestador;
    }

    @Override
    public List<RiesgoDTO> crearMatrizRiesgo() {
        return riesgoOrquestador.creacionMatrizRiesgo();
    }
}
