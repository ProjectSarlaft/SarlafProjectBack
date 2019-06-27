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
    private String rLegal;

    @NotNull
    private String rOperativo;

    @NotNull
    private String rReputacional;

    @NotNull
    private String rContagio;

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

    public String getrLegal() {
        return rLegal;
    }

    public void setrLegal(String rLegal) {
        this.rLegal = rLegal;
    }

    public String getrOperativo() {
        return rOperativo;
    }

    public void setrOperativo(String rOperativo) {
        this.rOperativo = rOperativo;
    }

    public String getrReputacional() {
        return rReputacional;
    }

    public void setrReputacional(String rReputacional) {
        this.rReputacional = rReputacional;
    }

    public String getrContagio() {
        return rContagio;
    }

    public void setrContagio(String rContagio) {
        this.rContagio = rContagio;
    }
}
