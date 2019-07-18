    package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

    @Entity
@Table(name = "riesgo")
public class Riesgo implements Serializable {

    @EmbeddedId
    private RiesgoId riesgoId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Impacto_escala")
    private Impacto impacto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Probabilidad_escala")
    private Probabilidad probabilidad;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RiesgoEscala_escala")
    private RiesgoEscala riesgoEscala;

    public RiesgoId getRiesgoId() {
        return riesgoId;
    }

    public void setRiesgoId(RiesgoId riesgoId) {
        this.riesgoId = riesgoId;
    }

    public Impacto getImpacto() {
        return impacto;
    }

    public void setImpacto(Impacto impacto) {
        this.impacto = impacto;
    }

    public Probabilidad getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(Probabilidad probabilidad) {
        this.probabilidad = probabilidad;
    }

    public RiesgoEscala getRiesgoEscala() {
        return riesgoEscala;
    }

    public void setRiesgoEscala(RiesgoEscala riesgoEscala) {
        this.riesgoEscala = riesgoEscala;
    }

    @Override
    public String toString() {
        return "RiesgoControlador{" +
                "riesgoId=" + riesgoId +
                ", impacto=" + impacto +
                ", probabilidad=" + probabilidad +
                ", riesgoEscala=" + riesgoEscala +
                '}';
    }
}
