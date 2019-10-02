package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.*;

@Entity
@Table(name = "RiesgoEscala")
public class RiesgoEscala {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "escala")
    private String escala;

    @Column(name = "color")
    private String color;

    public Long getId(){
        return id;
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









