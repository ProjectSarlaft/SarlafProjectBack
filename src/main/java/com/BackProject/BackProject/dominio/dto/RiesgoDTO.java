package com.BackProject.BackProject.dominio.dto;

public class RiesgoDTO {

    private Long riesgoId;

    private ImpactoDTO impacto;

    private ProbabilidadDTO probabilidad;

    private RiesgoEscalaDTO riesgoEscala;

    public Long getRiesgoId() {
        return riesgoId;
    }

    public void setRiesgoId(Long riesgoId) {
        this.riesgoId = riesgoId;
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
