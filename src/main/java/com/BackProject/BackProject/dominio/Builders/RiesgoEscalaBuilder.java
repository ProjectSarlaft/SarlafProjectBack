package com.BackProject.BackProject.dominio.Builders;

import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.entidades.RiesgoEscala;

public class RiesgoEscalaBuilder {
    private String escala;
    private String color;

    public RiesgoEscalaBuilder escalaRiesgo(String escala){
        this.escala = escala;
        return this;
    }

    public RiesgoEscalaBuilder colorRiesgo(String color){
        this.color = color;
        return  this;
    }

    public RiesgoEscalaDTO build(){
        RiesgoEscalaDTO riesgoEscala = new RiesgoEscalaDTO();
        riesgoEscala.setColor(color);
        riesgoEscala.setEscala(escala);
        return riesgoEscala;
    }

}
