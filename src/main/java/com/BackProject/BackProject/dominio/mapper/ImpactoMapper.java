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
        impacto.setrLegal(impactoDTO.getrLegal());
        impacto.setrOperativo(impactoDTO.getrOperativo());
        impacto.setrReputacional(impactoDTO.getrReputacional());
        impacto.setrContagio(impactoDTO.getrContagio());

        return impacto;
    }

    public ImpactoDTO impactoEntityToDTO(Impacto impacto){
        ImpactoDTO impactoDTO = new ImpactoDTO();
        impactoDTO.setEscala(impacto.getEscala());
        impactoDTO.setNivel(impacto.getNivel());
        impactoDTO.setAfectacionEconomica(impacto.getAfectacionEconomica());
        impactoDTO.setrLegal(impacto.getrLegal());
        impactoDTO.setrOperativo(impacto.getrOperativo());
        impactoDTO.setrReputacional(impacto.getrReputacional());
        impactoDTO.setrContagio(impacto.getrContagio());

        return impactoDTO;
    }
}
