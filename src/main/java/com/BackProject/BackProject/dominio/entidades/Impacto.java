package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ImpactoDTO")
public class Impacto {

    @Id
    @Column(name = "Escala")
    private String escala;

    @Column(name = "Nivel")
    private String nivel;

    @Column(name = "Afectacion_Economica")
    private String afectacionEconomica;

    @Column(name = "Riesgo_Legal")
    private String rLegal;

    @Column(name = "Riesgo_Operativo")
    private String rOperativo;

    @Column(name = "Riesgo_Reputacional")
    private String rReputacional;

    @Column(name = "Riesgo_Contagio")
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

    @Override
    public String toString() {
        return "Impacto{" +
                "escala='" + escala + '\'' +
                ", nivel='" + nivel + '\'' +
                ", afectacionEconomica='" + afectacionEconomica + '\'' +
                ", rLegal='" + rLegal + '\'' +
                ", rOperativo='" + rOperativo + '\'' +
                ", rReputacional='" + rReputacional + '\'' +
                ", rContagio='" + rContagio + '\'' +
                '}';
    }
}
