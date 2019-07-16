package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class IdentificacionId implements Serializable {

    @Column(name = "riesgo")
    private String riesgo;

    @Column(name = "proceso")
    private String proceso;

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
}
