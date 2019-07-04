package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.entidades.Impacto;
import com.BackProject.BackProject.dominio.mapper.ImpactoMapper;
import com.BackProject.BackProject.repositorios.ImpactoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpactoImpl implements ServiceImpacto{
    private final ImpactoRepositorio impactoRepositorio;
    private final ImpactoMapper impactoMapper;

    public ServiceImpactoImpl(ImpactoRepositorio impactoRepositorio, ImpactoMapper impactoMapper) {
        this.impactoRepositorio = impactoRepositorio;
        this.impactoMapper = impactoMapper;
    }

    @Override
    public ImpactoDTO guardarImpacto(ImpactoDTO impactoDTO) {
        Impacto impacto = impactoMapper.impactoDTOToEntity(impactoDTO);
        Impacto registroInsertadoImpacto = impactoRepositorio.save(impacto);
        return impactoMapper.impactoEntityToDTO(impacto);
    }

    @Override
    public void borrarImpacto(String escala) {
        impactoRepositorio.deleteById(escala);
    }
}
