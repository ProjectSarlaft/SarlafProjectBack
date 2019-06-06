package com.BackProject.BackProject.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentificationTest {

    Identification identification;

    private static final String PROCEDURE = "procedure";
    private static final String RISK = "risk";
    private static final String DESCRIPTION = "description";
    private static final String LEGAL_RISK = "legal_risk";
    private static final String OPERATIVE_RISK = "operative_risk";
    private static final String CONTAGIOUS_RISK = "contagious_risk";
    private static final String REPUTATIONAL_RISK = "reputational_risk";
    private static final String RISK_CLIENT = "risk_client";
    private static final String RISK_PRODUCTS = "risk_products";
    private static final String RISK_DISTRIBUTION = "risk_distribution";
    private static final String RISK_JURISDICTION = "risk_jurisdiction";
    private static final String IDENTIFICATION_TO_STRING = "Identification{riesgo='risk', proceso='procedure', descripcion='description', riesgoLegal='legal_risk', riesgoOperativo='operative_risk', riesgoContagio='contagious_risk', riesgoReputacional='reputational_risk', riesgoCliente='risk_client', riesgoProductos='risk_products', riesgoDistribucion='risk_distribution', riesgoJurisdiccion='risk_jurisdiction'}";

    @Before
    public void setUp() throws Exception {
        identification = new Identification();
    }

    @Test
    public void Identificattion(){
        //When

        identification.setProceso(PROCEDURE);
        identification.setRiesgo(RISK);
        identification.setDescripcion(DESCRIPTION);
        identification.setRiesgoLegal(LEGAL_RISK);
        identification.setRiesgoOperativo(OPERATIVE_RISK);
        identification.setRiesgoContagio(CONTAGIOUS_RISK);
        identification.setRiesgoReputacional(REPUTATIONAL_RISK);
        identification.setRiesgoCliente(RISK_CLIENT);
        identification.setRiesgoProductos(RISK_PRODUCTS);
        identification.setRiesgoDistribucion(RISK_DISTRIBUTION);
        identification.setRiesgoJurisdiccion(RISK_JURISDICTION);

        // Then

        Assert.assertEquals(identification.getProceso(), PROCEDURE);
        Assert.assertEquals(identification.getRiesgo(), RISK);
        Assert.assertEquals(identification.getDescripcion(), DESCRIPTION);
        Assert.assertEquals(identification.getRiesgoLegal(), LEGAL_RISK);
        Assert.assertEquals(identification.getRiesgoOperativo(), OPERATIVE_RISK);
        Assert.assertEquals(identification.getRiesgoContagio(), CONTAGIOUS_RISK);
        Assert.assertEquals(identification.getRiesgoReputacional(), REPUTATIONAL_RISK);
        Assert.assertEquals(identification.getRiesgoCliente(), RISK_CLIENT);
        Assert.assertEquals(identification.getRiesgoProductos(), RISK_PRODUCTS);
        Assert.assertEquals(identification.getRiesgoDistribucion(), RISK_DISTRIBUTION);
        Assert.assertEquals(identification.getRiesgoJurisdiccion(), RISK_JURISDICTION);
        Assert.assertEquals(identification.toString(), IDENTIFICATION_TO_STRING);
    }




}