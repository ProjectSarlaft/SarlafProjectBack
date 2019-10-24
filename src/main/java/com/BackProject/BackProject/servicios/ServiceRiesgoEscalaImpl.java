package com.BackProject.BackProject.servicios;


import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.entidades.RiesgoEscala;
import com.BackProject.BackProject.dominio.mapper.RiesgoEscalaMapper;
import com.BackProject.BackProject.repositorios.RiesgoEscalaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceRiesgoEscalaImpl implements ServiceRiesgoEscala {

    final private RiesgoEscalaRepositorio riesgoEscalaRepositorio;
    final private RiesgoEscalaMapper riesgoEscalaMapper;

    public ServiceRiesgoEscalaImpl(RiesgoEscalaRepositorio riesgoEscalaRepositorio, RiesgoEscalaMapper riesgoEscalaMapper) {
        this.riesgoEscalaRepositorio = riesgoEscalaRepositorio;
        this.riesgoEscalaMapper = riesgoEscalaMapper;
    }


    @Override
    public List<RiesgoEscalaDTO> retornarRiesgoEscala() {
        return riesgoEscalaRepositorio.findAll()
                                      .stream()
                                      .map((riesgoEscala) -> riesgoEscalaMapper.riesgoEscalaEntityToDto(riesgoEscala))
                                      .collect(Collectors.toList());
    }

    @Override
    public void borrarRiesgoEscala(String riesgoEscalaId) {
        riesgoEscalaRepositorio.deleteById(riesgoEscalaId);
    }

    @Override
    public RiesgoEscalaDTO guardarRiesgoEscala(RiesgoEscalaDTO riesgoEscalaDTO) {
        RiesgoEscala riesgoEscala = riesgoEscalaMapper.riesgoEscalaDtoToEntity(riesgoEscalaDTO);
        RiesgoEscala riesgoEscalaInsertado = riesgoEscalaRepositorio.save(riesgoEscala);
        return riesgoEscalaMapper.riesgoEscalaEntityToDto(riesgoEscalaInsertado);
    }
}
