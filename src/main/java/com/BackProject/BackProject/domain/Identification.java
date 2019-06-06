package com.BackProject.BackProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Identification")
public class Identification {


    @Id
    @Column(name = "riesgo")
    private String riesgo;

    @Column(name = "proceso")
    private String proceso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "riesgoLegal")
    private String riesgoLegal;

    @Column(name = "riesgoOperativo")
    private String riesgoOperativo;

    @Column(name = "riesgoContagio")
    private String riesgoContagio;

    @Column(name = "riesgoReputacional")
    private String riesgoReputacional;

    @Column(name = "riesgoCliente")
    private String riesgoCliente;

    @Column(name = "riesgoProductos")
    private String riesgoProductos;

    @Column(name = "riesgoDistribucion")
    private String riesgoDistribucion;

    @Column(name = "riesgoJurisdiccion")
    private String riesgoJurisdiccion;

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

    public String getRiesgoLegal() {
        return riesgoLegal;
    }

    public void setRiesgoLegal(String riesgoLegal) {
        this.riesgoLegal = riesgoLegal;
    }

    public String getRiesgoOperativo() {
        return riesgoOperativo;
    }

    public void setRiesgoOperativo(String riesgoOperativo) {
        this.riesgoOperativo = riesgoOperativo;
    }

    public String getRiesgoContagio() {
        return riesgoContagio;
    }

    public void setRiesgoContagio(String riesgoContagio) {
        this.riesgoContagio = riesgoContagio;
    }

    public String getRiesgoReputacional() {
        return riesgoReputacional;
    }

    public void setRiesgoReputacional(String riesgoReputacional) {
        this.riesgoReputacional = riesgoReputacional;
    }

    public String getRiesgoCliente() {
        return riesgoCliente;
    }

    public void setRiesgoCliente(String riesgoCliente) {
        this.riesgoCliente = riesgoCliente;
    }

    public String getRiesgoProductos() {
        return riesgoProductos;
    }

    public void setRiesgoProductos(String riesgoProductos) {
        this.riesgoProductos = riesgoProductos;
    }

    public String getRiesgoDistribucion() {
        return riesgoDistribucion;
    }

    public void setRiesgoDistribucion(String riesgoDistribucion) {
        this.riesgoDistribucion = riesgoDistribucion;
    }

    public String getRiesgoJurisdiccion() {
        return riesgoJurisdiccion;
    }

    public void setRiesgoJurisdiccion(String riesgoJurisdiccion) {
        this.riesgoJurisdiccion = riesgoJurisdiccion;
    }

    @Override
    public String toString() {
        return "Identification{" +
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









