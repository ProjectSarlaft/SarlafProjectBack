    package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "riesgo")
public class Riesgo implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "impacto_id")
    private Impacto impacto;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "probabilidad_id")
    private Probabilidad probabilidad;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "riesgoEscala_id")
    private RiesgoEscala riesgoEscala;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Riesgo{" +
                "id=" + id +
                ", impacto=" + impacto +
                ", probabilidad=" + probabilidad +
                ", riesgoEscala=" + riesgoEscala +
                '}';
    }
}
