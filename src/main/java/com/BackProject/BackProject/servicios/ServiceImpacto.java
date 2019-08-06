package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;

import java.util.List;

public interface ServiceImpacto {
    ImpactoDTO guardarImpacto (ImpactoDTO impacto);

    ImpactoDTO actualizarImpacto(ImpactoDTO impactoDTO);

    void borrarImpacto(Long escala);

    List<ImpactoDTO> retornarImpactos();
}
