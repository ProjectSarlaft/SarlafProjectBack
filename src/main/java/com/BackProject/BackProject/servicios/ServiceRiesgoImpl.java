package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.entidades.RiesgoEscala;
import com.BackProject.BackProject.dominio.mapper.RiesgoEscalaMapper;
import com.BackProject.BackProject.orquestador.RiesgoOrquestador;
import com.BackProject.BackProject.repositorios.RiesgoEscalaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
