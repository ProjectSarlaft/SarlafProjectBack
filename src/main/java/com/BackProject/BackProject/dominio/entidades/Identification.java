package com.BackProject.BackProject.dominio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IdentificationDTO")
public class Identification {


    @Id
    @Column(name = "riesgo")
    private String riesgo;

    @Column(name = "proceso")
    private String proceso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "riesgoLegal")
    private Boolean riesgoLegal;

    @Column(name = "riesgoOperativo")
    private Boolean riesgoOperativo;

    @Column(name = "riesgoContagio")
    private Boolean riesgoContagio;

    @Column(name = "riesgoReputacional")
    private Boolean riesgoReputacional;

    @Column(name = "riesgoCliente")
    private Boolean riesgoCliente;

    @Column(name = "riesgoProductos")
    private Boolean riesgoProductos;

    @Column(name = "riesgoDistribucion")
    private Boolean riesgoDistribucion;

    @Column(name = "riesgoJurisdiccion")
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









