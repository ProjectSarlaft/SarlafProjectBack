package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.entidades.RiesgoEscala;
import com.BackProject.BackProject.dominio.mapper.RiesgoEscalaMapper;
import com.BackProject.BackProject.dominio.mapper.RiesgoMapper;
import com.BackProject.BackProject.exceptions.InsercionRiesgoEscalaException;
import com.BackProject.BackProject.orquestador.RiesgoOrquestador;
import com.BackProject.BackProject.repositorios.RiesgoEscalaRepositorio;
import com.BackProject.BackProject.repositorios.RiesgoRepositorio;
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
    public void borrarRiesgoEscala(String escala) {
        riesgoEscalaRepositorio.deleteById(escala);
    }

    @Override
    public RiesgoEscalaDTO guardarRiesgoEscala(RiesgoEscalaDTO riesgoEscalaDTO) {
        if(riesgoEscalaEnUso(riesgoEscalaDTO)){
            throw new InsercionRiesgoEscalaException();
        }
        RiesgoEscala riesgoEscala = riesgoEscalaMapper.riesgoEscalaDtoToEntity(riesgoEscalaDTO);
        return riesgoEscalaMapper.riesgoEscalaEntityToDto(riesgoEscalaRepositorio.save(riesgoEscala));
    }

    private boolean riesgoEscalaEnUso(RiesgoEscalaDTO riesgoEscalaDTO) {
        return !riesgoEscalaRepositorio.findAll().stream()
                .noneMatch((riesgoEscala) -> riesgoEscala.getEscala().equals(riesgoEscala.getEscala())
                        && !riesgoEscala.getId().equals(riesgoEscala.getId()));
    }
}
