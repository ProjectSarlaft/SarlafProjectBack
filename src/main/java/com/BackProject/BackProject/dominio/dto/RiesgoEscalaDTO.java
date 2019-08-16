package com.BackProject.BackProject.dominio.dto;

public class RiesgoEscalaDTO {

    private String escala;

    private String color;

    private Long id;

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
