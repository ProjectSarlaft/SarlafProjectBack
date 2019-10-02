package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = ("Probabilidad"))
public class Probabilidad {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "escala")
    private String escala;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "posibilidadAnual")
    private String posibilidadAnual;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", escala='" + escala + '\'' +
                ", nivel='" + nivel + '\'' +
                ", posibilidadAnual='" + posibilidadAnual + '\'' +
                '}';
    }
}
