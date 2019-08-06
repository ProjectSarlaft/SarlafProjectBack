package com.BackProject.BackProject.dominio.mapper;

import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.entidades.Riesgo;
import com.BackProject.BackProject.dominio.entidades.RiesgoId;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RiesgoMapper {

    private final ImpactoMapper impactoMapper;
    private final ProbabilidadMapper probabilidadMapper;
    private final RiesgoEscalaMapper riesgoEscalaMapper;

    public RiesgoMapper(ImpactoMapper impactoMapper, ProbabilidadMapper probabilidadMapper, RiesgoEscalaMapper riesgoEscalaMapper) {
        this.impactoMapper = impactoMapper;
        this.probabilidadMapper = probabilidadMapper;
        this.riesgoEscalaMapper = riesgoEscalaMapper;
    }

    public Riesgo riesgoDtoToEntity(RiesgoDTO riesgoDTO){
        Riesgo riesgo = new Riesgo();

        RiesgoId riesgoId = new RiesgoId();
        riesgoId.setEscalaProbabilidad(riesgoDTO.getEscalaProbabilidad());
        riesgoId.setEscalaImpacto(riesgoDTO.getEscalaImpacto());
        riesgo.setImpacto(impactoMapper.impactoDTOToEntity(riesgoDTO.getImpacto()));
        riesgo.setProbabilidad(probabilidadMapper.probabilidadDTOtoEntidad(riesgoDTO.getProbabilidad()));
        riesgo.setRiesgoEscala(riesgoEscalaMapper.riesgoEscalaDtoToEntity(riesgoDTO.getRiesgoEscala()));
        riesgo.setRiesgoId(riesgoId);

        return riesgo;
    }

    public RiesgoDTO riesgoEntityToRiesgoDTO(Riesgo riesgo) {
        RiesgoDTO riesgoDTO = new RiesgoDTO();
        riesgoDTO.setEscalaImpacto(riesgo.getRiesgoId().getEscalaImpacto());
        riesgoDTO.setEscalaProbabilidad(riesgo.getRiesgoId().getEscalaProbabilidad());
        riesgoDTO.setImpacto(impactoMapper.impactoEntityToDTO(riesgo.getImpacto()));
        riesgoDTO.setProbabilidad(probabilidadMapper.probabilidadEntidadToDTO(riesgo.getProbabilidad()));
        riesgoDTO.setRiesgoEscala(riesgoEscalaMapper.riesgoEscalaEntityToDto(riesgo.getRiesgoEscala()));

        return riesgoDTO;
    }
}
