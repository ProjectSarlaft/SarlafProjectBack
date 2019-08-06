package com.BackProject.BackProject.dominio.mapper;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.entidades.Impacto;
import org.springframework.stereotype.Component;

@Component
public class ImpactoMapper {

    public Impacto impactoDTOToEntity(ImpactoDTO impactoDTO){
        Impacto impacto = new Impacto();
        impacto.setEscala(impactoDTO.getEscala());
        impacto.setNivel(impactoDTO.getNivel());
        impacto.setAfectacionEconomica(impactoDTO.getAfectacionEconomica());
        impacto.setRiesgoLegal(impactoDTO.getRiesgoLegal());
        impacto.setRiesgoOperativo(impactoDTO.getRiesgoOperativo());
        impacto.setRiesgoReputacional(impactoDTO.getRiesgoReputacional());
        impacto.setRiesgoContagio(impactoDTO.getRiesgoContagio());

        return impacto;
    }

    public ImpactoDTO impactoEntityToDTO(Impacto impacto){
        ImpactoDTO impactoDTO = new ImpactoDTO();
        impactoDTO.setId(impacto.getId());
        impactoDTO.setEscala(impacto.getEscala());
        impactoDTO.setNivel(impacto.getNivel());
        impactoDTO.setAfectacionEconomica(impacto.getAfectacionEconomica());
        impactoDTO.setRiesgoLegal(impacto.getRiesgoLegal());
        impactoDTO.setRiesgoOperativo(impacto.getRiesgoOperativo());
        impactoDTO.setRiesgoReputacional(impacto.getRiesgoReputacional());
        impactoDTO.setRiesgoContagio(impacto.getRiesgoContagio());

        return impactoDTO;
    }
}
