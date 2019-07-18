package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Locale;

@Entity
@Table(name = "RiesgoEscala")
public class RiesgoEscala {
    @Id
    @Column(name = "escala")
    private String escala;

    @Column(name = "color")
    private String color;

    private String escala1;
    private String color1;

    public void setEscala1(String escala1) {
        this.escala1 = escala1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
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


    @Override
    public String toString() {
        return "RiesgoEscala{" +
                "escala1='" + escala1 + '\'' +
                ", color1='" + color1 + '\'' +
                '}';
    }
}

    class RiesgoEscalaRecibida{








    private final RiesgoEscala riesgoEscala = new RiesgoEscala();

    public RiesgoEscalaRecibida(){
        Thread n1 = new Thread(new Runnable() {
            @Override
            public void run() {
            riesgoEscala.setEscala1("bajo");
            riesgoEscala.setColor1("rojo");
            }
        });

        n1.start();
    }

        public RiesgoEscala getRiesgoEscala() {
            return riesgoEscala;
        }
    }







