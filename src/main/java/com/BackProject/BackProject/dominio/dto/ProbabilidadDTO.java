package com.BackProject.BackProject.dominio.dto;

import javax.validation.constraints.NotNull;

public class ProbabilidadDTO {

    @NotNull
    private String escala;

    @NotNull
    private String nivel;

    @NotNull
    private String posibilidadAnual;

    public String getEscala() {
        return escala;
    }

    public String getNivel() {
        return nivel;
    }

    public String getPosibilidadAnual() {
        return posibilidadAnual;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setPosibilidadAnual(String posibilidadAnual) {
        this.posibilidadAnual = posibilidadAnual;
    }
}
