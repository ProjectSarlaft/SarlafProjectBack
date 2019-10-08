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
    private final RiesgoEscalaRepositorio riesgoEscalaRepositorio;
    private final RiesgoEscalaMapper riesgoEscalaMapper;

    public ServiceRiesgoImpl(RiesgoOrquestador riesgoOrquestador, RiesgoEscalaRepositorio riesgoEscalaRepositorio, RiesgoEscalaMapper riesgoEscalaMapper) {
        this.riesgoOrquestador = riesgoOrquestador;
        this.riesgoEscalaRepositorio = riesgoEscalaRepositorio;
        this.riesgoEscalaMapper = riesgoEscalaMapper;
    }

    @Override
    public List<RiesgoDTO> crearMatrizRiesgo() {
        return riesgoOrquestador.creacionMatrizRiesgo();
    }

    @Override
    public List<RiesgoEscalaDTO> retornarRiesgoEscala() {
        return riesgoEscalaRepositorio.findAll()
                .stream()
                .map((riesgoEscala) -> riesgoEscalaMapper.riesgoEscalaEntityToDto(riesgoEscala))
                .collect(Collectors.toList());
    }

    @Override
    public void borrarRiesgoEscala(Long riesgoEscalaId) {
        riesgoEscalaRepositorio.deleteById(riesgoEscalaId);
    }

    @Override
    public RiesgoEscalaDTO guardarRiesgoEscala(RiesgoEscalaDTO riesgoEscalaDTO) {
        RiesgoEscala riesgoEscala = riesgoEscalaMapper.riesgoEscalaDtoToEntity(riesgoEscalaDTO);
        return riesgoEscalaMapper.riesgoEscalaEntityToDto(riesgoEscalaRepositorio.save(riesgoEscala));
    }

}
