package com.BackProject.BackProject.dominio.dto;

import javax.validation.constraints.NotNull;

public class ImpactoDTO {

    @NotNull
    private String escala;

    @NotNull
    private String nivel;

    @NotNull
    private String afectacionEconomica;

    @NotNull
    private String riesgoLegal;

    @NotNull
    private String riesgoOperativo;

    @NotNull
    private String riesgoReputacional;

    @NotNull
    private String riesgoContagio;

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getAfectacionEconomica() {
        return afectacionEconomica;
    }

    public void setAfectacionEconomica(String afectacionEconomica) {
        this.afectacionEconomica = afectacionEconomica;
    }

    public String getRiesgoLegal() {
        return riesgoLegal;
    }

    public void setRiesgoLegal(String riesgoLegal) {
        this.riesgoLegal = riesgoLegal;
    }

    public String getRiesgoOperativo() {
        return riesgoOperativo;
    }

    public void setRiesgoOperativo(String riesgoOperativo) {
        this.riesgoOperativo = riesgoOperativo;
    }

    public String getRiesgoReputacional() {
        return riesgoReputacional;
    }

    public void setRiesgoReputacional(String riesgoReputacional) {
        this.riesgoReputacional = riesgoReputacional;
    }

    public String getRiesgoContagio() {
        return riesgoContagio;
    }

    public void setRiesgoContagio(String riesgoContagio) {
        this.riesgoContagio = riesgoContagio;
    }
}
