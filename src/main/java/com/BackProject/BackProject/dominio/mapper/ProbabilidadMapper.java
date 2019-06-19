package com.BackProject.BackProject.dominio.mapper;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.entidades.Probabilidad;
import org.springframework.stereotype.Component;

@Component
public class ProbabilidadMapper {
    public Probabilidad probabilidadDTOtoEntidad(ProbabilidadDTO probabilidadDTO){
        Probabilidad probabilidad = new Probabilidad();
        probabilidad.setEscala(probabilidadDTO.getEscala());
        probabilidad.setNivel(probabilidadDTO.getNivel());
        probabilidad.setPosibilidadAnual(probabilidadDTO.getPosibilidadAnual());
     return probabilidad;
    }

    public ProbabilidadDTO probabilidadEntidadToDTO(Probabilidad probabilidad){
        ProbabilidadDTO probabilidadDTO = new ProbabilidadDTO();
        probabilidadDTO.setEscala(probabilidad.getEscala());
        probabilidadDTO.setNivel(probabilidad.getNivel());
        probabilidadDTO.setPosibilidadAnual(probabilidad.getPosibilidadAnual());

        return probabilidadDTO;
    }

}
