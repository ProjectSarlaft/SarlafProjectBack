package com.BackProject.BackProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Identification")
public class Identification {


    @Id
    @Column(name = "risk_id")
    private String risk_id;

    @Column(name = "procedure")
    private String procedure;

    @Column(name = "code")
    private String code;

    @Column(name = "risk")
    private String risk;

    @Column(name = "description")
    private String description;

    @Column(name = "cause")
    private String cause;

    @Column(name = "legal_risk")
    private String legal_risk;

    @Column(name = "operative_risk")
    private String operative_risk;

    @Column(name = "contagious_risk")
    private String contagious_risk;

    @Column(name = "reputational_risk")
    private String reputational_risk;

    @Column(name = "risk_client")
    private String risk_client;

    @Column(name = "risk_products")
    private String risk_products;

    @Column(name = "risk_distribution")
    private String risk_distribution;

    @Column(name = "risk_jurisdiction")
    private String risk_jurisdiction;

    public String getRisk_id() {
        return risk_id;
    }

    public void setRisk_id(String risk_id) {
        this.risk_id = risk_id;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescripcion(String description) {
        this.description = description;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getLegal_risks() {
        return legal_risk;
    }

    public void setLegal_risk(String legal_risk) {
        this.legal_risk = legal_risk;
    }

    public String getOperative_risk() {
        return operative_risk;
    }

    public void setOperative_risk(String operative_risk) {
        this.operative_risk = operative_risk;
    }

    public String getContagious_risk() {
        return contagious_risk;
    }

    public void setContagious_risk(String contagious_risk) {
        this.contagious_risk = contagious_risk;
    }

    public String getReputational_risk() {
        return reputational_risk;
    }

    public void setReputational_risk(String reputational_risk) {
        this.reputational_risk = reputational_risk;
    }

    public String getRisk_client() {
        return risk_client;
    }

    public void setRisk_client(String risk_client) {
        this.risk_client = risk_client;
    }

    public String getRisk_products() {
        return risk_products;
    }

    public void setRisk_products(String risk_products) {
        this.risk_products = risk_products;
    }

    public String getRisk_distribution() {
        return risk_distribution;
    }

    public void setRisk_distribution(String risk_distribution) {
        this.risk_distribution = risk_distribution;
    }

    public String getRisk_jurisdiction() {
        return risk_jurisdiction;
    }

    public void setRisk_jurisdiction(String risk_jurisdiction) {
        this.risk_jurisdiction = risk_jurisdiction;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "risk_id='" + risk_id + '\'' +
                ", procedure='" + procedure + '\'' +
                ", code='" + code + '\'' +
                ", risk='" + risk + '\'' +
                ", description='" + description + '\'' +
                ", cause='" + cause + '\'' +
                ", legal_risk='" + legal_risk + '\'' +
                ", operative_risk='" + operative_risk + '\'' +
                ", contagious_risk='" + contagious_risk + '\'' +
                ", reputational_risk='" + reputational_risk + '\'' +
                ", risk_client='" + risk_client + '\'' +
                ", risk_products='" + risk_products + '\'' +
                ", risk_distribution='" + risk_distribution + '\'' +
                ", risk_jurisdiction='" + risk_jurisdiction + '\'' +
                '}';
    }
}









