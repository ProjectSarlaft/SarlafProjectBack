package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.*;

@Entity
@Table(name = "RiesgoEscala")
public class RiesgoEscala {

    @Id
    @Column(name = "color")
    private String color;

    @Column(name = "escala")
    private String escala;

    private String accion;

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}









