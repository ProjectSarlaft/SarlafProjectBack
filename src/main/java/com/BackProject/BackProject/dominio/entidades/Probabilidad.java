package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = ("ProbabilidadDTO"))
public class Probabilidad {

    @Id
    @Column(name = "Escala")
    private String escala;

    @Column(name = "Nivel")
    private String nivel;

    @Column(name = "Posibilidad_Anual")
    private String posibilidadAnual;

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setPosibilidadAnual(String posibilidadAnual) {
        this.posibilidadAnual = posibilidadAnual;
    }

    public String getEscala() {
        return escala;
    }

    public String getNivel() {
        return nivel;
    }

    public String getPosibilidadAnual() {
        return posibilidadAnual;
    }


    @Override
    public String toString() {
        return "Probabilidad{" +
                "escala='" + escala + '\'' +
                ", nivel='" + nivel + '\'' +
                ", posibilidadAnual='" + posibilidadAnual + '\'' +
                '}';
    }
}
