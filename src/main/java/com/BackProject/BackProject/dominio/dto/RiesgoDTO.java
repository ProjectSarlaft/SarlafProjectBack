package com.BackProject.BackProject.dominio.dto;

public class RiesgoDTO {

    private String escalaImpacto;

    private String escalaProbabilidad;

    private ImpactoDTO impacto;

    private ProbabilidadDTO probabilidad;

    private RiesgoEscalaDTO riesgoEscala;

    public String getEscalaImpacto() {
        return escalaImpacto;
    }

    public void setEscalaImpacto(String escalaImpacto) {
        this.escalaImpacto = escalaImpacto;
    }

    public String getEscalaProbabilidad() {
        return escalaProbabilidad;
    }

    public void setEscalaProbabilidad(String escalaProbabilidad) {
        this.escalaProbabilidad = escalaProbabilidad;
    }

    public ImpactoDTO getImpacto() {
        return impacto;
    }

    public void setImpacto(ImpactoDTO impacto) {
        this.impacto = impacto;
    }

    public ProbabilidadDTO getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(ProbabilidadDTO probabilidad) {
        this.probabilidad = probabilidad;
    }

    public RiesgoEscalaDTO getRiesgoEscala() {
        return riesgoEscala;
    }

    public void setRiesgoEscala(RiesgoEscalaDTO riesgoEscala) {
        this.riesgoEscala = riesgoEscala;
    }
}
