package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.entidades.Impacto;
import com.BackProject.BackProject.dominio.mapper.ImpactoMapper;
import com.BackProject.BackProject.exceptions.InsercionImpactoException;
import com.BackProject.BackProject.repositorios.ImpactoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImpactoImpl implements ServiceImpacto {
    private final ImpactoRepositorio impactoRepositorio;
    private final ImpactoMapper impactoMapper;

    public ServiceImpactoImpl(ImpactoRepositorio impactoRepositorio, ImpactoMapper impactoMapper) {
        this.impactoRepositorio = impactoRepositorio;
        this.impactoMapper = impactoMapper;
    }


    @Override
    public ImpactoDTO guardarImpacto(ImpactoDTO impactoDTO) {
        if(estaEscalaImpactoEnUso(impactoDTO)){
            throw new InsercionImpactoException();
        }
        Impacto impacto = impactoMapper.impactoDTOToEntity(impactoDTO);
        impacto = impactoRepositorio.save(impacto);
        return impactoMapper.impactoEntityToDTO(impacto);
    }

    @Override
    public ImpactoDTO actualizarImpacto(ImpactoDTO impactoDTO) {
        if(estaEscalaImpactoEnUso(impactoDTO)){
            throw new InsercionImpactoException();
        }
        Impacto impacto = impactoRepositorio.findById(impactoDTO.getId()).get();
        impacto.setEscala(impactoDTO.getEscala());
        impacto.setNivel(impactoDTO.getNivel());
        impacto.setAfectacionEconomica(impactoDTO.getAfectacionEconomica());
        impacto.setRiesgoLegal(impactoDTO.getRiesgoLegal());
        impacto.setRiesgoOperativo(impactoDTO.getRiesgoOperativo());
        impacto.setRiesgoReputacional(impactoDTO.getRiesgoReputacional());
        impacto.setRiesgoContagio(impactoDTO.getRiesgoContagio());
        impacto = impactoRepositorio.save(impacto);
        return impactoMapper.impactoEntityToDTO(impacto);
    }

    @Override
    public void borrarImpacto(Long impactoID) {
        impactoRepositorio.deleteById(impactoID);
    }

    @Override
    public List<ImpactoDTO> retornarImpactos() {
        return impactoRepositorio.findAll().stream()
                .map((impacto) -> impactoMapper.impactoEntityToDTO(impacto))
                .collect(Collectors.toList());
    }


    private boolean estaEscalaImpactoEnUso(ImpactoDTO impactoDTO) {
        return !impactoRepositorio.findAll().stream()
                .noneMatch((impacto) -> impacto.getEscala().equals(impactoDTO.getEscala())
                        && !impacto.getId().equals(impactoDTO.getId()));
    }
}
