package com.BackProject.BackProject.dominio.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IdentificationDTO {

    @NotNull
    @Size(min = 3, max = 25, message = "El campo riesgo no fue llenado adecuadamente")
    private String riesgo;

    @NotNull
    @Size(min = 3, max = 25, message = "El campo proceso no fue llenado adecuadamente")
    private String proceso;

    @NotNull
    @Size(min = 3, max = 25, message = "El campo descripcion no fue llenado adecuadamente")
    private String descripcion;

    private Boolean riesgoLegal;

    private Boolean riesgoOperativo;

    private Boolean riesgoContagio;

    private Boolean riesgoReputacional;

    private Boolean riesgoCliente;

    private Boolean riesgoProductos;

    private Boolean riesgoDistribucion;

    private Boolean riesgoJurisdiccion;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getRiesgoLegal() {
        return riesgoLegal;
    }

    public void setRiesgoLegal(Boolean riesgoLegal) {
        this.riesgoLegal = riesgoLegal;
    }

    public Boolean getRiesgoOperativo() {
        return riesgoOperativo;
    }

    public void setRiesgoOperativo(Boolean riesgoOperativo) {
        this.riesgoOperativo = riesgoOperativo;
    }

    public Boolean getRiesgoContagio() {
        return riesgoContagio;
    }

    public void setRiesgoContagio(Boolean riesgoContagio) {
        this.riesgoContagio = riesgoContagio;
    }

    public Boolean getRiesgoReputacional() {
        return riesgoReputacional;
    }

    public void setRiesgoReputacional(Boolean riesgoReputacional) {
        this.riesgoReputacional = riesgoReputacional;
    }

    public Boolean getRiesgoCliente() {
        return riesgoCliente;
    }

    public void setRiesgoCliente(Boolean riesgoCliente) {
        this.riesgoCliente = riesgoCliente;
    }

    public Boolean getRiesgoProductos() {
        return riesgoProductos;
    }

    public void setRiesgoProductos(Boolean riesgoProductos) {
        this.riesgoProductos = riesgoProductos;
    }

    public Boolean getRiesgoDistribucion() {
        return riesgoDistribucion;
    }

    public void setRiesgoDistribucion(Boolean riesgoDistribucion) {
        this.riesgoDistribucion = riesgoDistribucion;
    }

    public Boolean getRiesgoJurisdiccion() {
        return riesgoJurisdiccion;
    }

    public void setRiesgoJurisdiccion(Boolean riesgoJurisdiccion) {
        this.riesgoJurisdiccion = riesgoJurisdiccion;
    }

    @Override
    public String toString() {
        return "IdentificationDTO{" +
                "riesgo='" + riesgo + '\'' +
                ", proceso='" + proceso + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", riesgoLegal='" + riesgoLegal + '\'' +
                ", riesgoOperativo='" + riesgoOperativo + '\'' +
                ", riesgoContagio='" + riesgoContagio + '\'' +
                ", riesgoReputacional='" + riesgoReputacional + '\'' +
                ", riesgoCliente='" + riesgoCliente + '\'' +
                ", riesgoProductos='" + riesgoProductos + '\'' +
                ", riesgoDistribucion='" + riesgoDistribucion + '\'' +
                ", riesgoJurisdiccion='" + riesgoJurisdiccion + '\'' +
                '}';
    }
}









