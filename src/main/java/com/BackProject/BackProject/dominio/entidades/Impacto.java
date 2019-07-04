package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Impacto")
public class Impacto {

    @Id
    @Column(name = "escala")
    private String escala;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "afectacionEconomica")
    private String afectacionEconomica;

    @Column(name = "riesgoLegal")
    private String riesgoLegal;

    @Column(name = "riesgoOperativo")
    private String riesgoOperativo;

    @Column(name = "riesgoReputacional")
    private String riesgoReputacional;

    @Column(name = "riesgoContagio")
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

    @Override
    public String toString() {
        return "Impacto{" +
                "escala='" + escala + '\'' +
                ", nivel='" + nivel + '\'' +
                ", afectacionEconomica='" + afectacionEconomica + '\'' +
                ", rLegal='" + riesgoLegal + '\'' +
                ", rOperativo='" + riesgoOperativo + '\'' +
                ", rReputacional='" + riesgoReputacional + '\'' +
                ", rContagio='" + riesgoContagio + '\'' +
                '}';
    }
}
