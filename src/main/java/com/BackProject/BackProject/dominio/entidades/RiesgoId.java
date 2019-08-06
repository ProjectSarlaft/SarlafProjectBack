package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Embeddable
public class RiesgoId implements Serializable {

    @Column(name = "escalaImpacto")
    private String escalaImpacto;

    @Column(name = "escalaProbabilidad")
    private String escalaProbabilidad;

    public String getEscalaImpacto() {
        return escalaImpacto;
    }

    public void setEscalaImpacto(String escalaImpacto) {
        this.escalaImpacto = escalaImpacto;
    }

    public String getEscalaProbabilidad() {
        return escalaProbabilidad;
    }

    public void setEscalaProbabilidad(String escalaProbabilidad) {
        this.escalaProbabilidad = escalaProbabilidad;
    }
}
