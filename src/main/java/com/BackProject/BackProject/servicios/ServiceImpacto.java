package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;

import java.util.List;

public interface ServiceImpacto {
    ImpactoDTO guardarImpacto (ImpactoDTO impacto);

    void borrarImpacto(String escala);

    List<ImpactoDTO> retornarImpactos();
}
