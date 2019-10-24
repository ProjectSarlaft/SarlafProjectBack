package com.BackProject.BackProject.dominio.mapper;

import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.entidades.Riesgo;
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
        riesgo.setImpacto(impactoMapper.impactoDTOToEntity(riesgoDTO.getImpacto()));
        riesgo.setProbabilidad(probabilidadMapper.probabilidadDTOtoEntidad(riesgoDTO.getProbabilidad()));
        riesgo.setRiesgoEscala(riesgoEscalaMapper.riesgoEscalaDtoToEntity(riesgoDTO.getRiesgoEscala()));
        riesgo.setId(riesgoDTO.getRiesgoId());

        return riesgo;
    }

    public RiesgoDTO riesgoEntityToRiesgoDTO(Riesgo riesgo) {
        RiesgoDTO riesgoDTO = new RiesgoDTO();
        riesgoDTO.setImpacto(impactoMapper.impactoEntityToDTO(riesgo.getImpacto()));
        riesgoDTO.setProbabilidad(probabilidadMapper.probabilidadEntidadToDTO(riesgo.getProbabilidad()));
        riesgoDTO.setRiesgoEscala(riesgoEscalaMapper.riesgoEscalaEntityToDto(riesgo.getRiesgoEscala()));
        riesgoDTO.setRiesgoId(riesgo.getId());

        return riesgoDTO;
    }
}
