package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;

public interface ServiceImpacto {
    ImpactoDTO guardarImpacto (ImpactoDTO impacto);

    void borrarImpacto(String escala);
}
