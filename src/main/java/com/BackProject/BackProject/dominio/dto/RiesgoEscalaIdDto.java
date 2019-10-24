package com.BackProject.BackProject.dominio.dto;

import javax.validation.constraints.NotNull;

public class RiesgoEscalaIdDto {

    @NotNull
    private String riesgoEscalaId;

    public String getRiesgoEscalaId() {
        return riesgoEscalaId;
    }

    public void setRiesgoEscalaId(String riesgoEscalaId) {
        this.riesgoEscalaId = riesgoEscalaId;
    }
}
