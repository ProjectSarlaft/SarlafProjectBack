package com.BackProject.BackProject.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentificationTest {

    Identification identification;

    private static final String RISK_ID = "riskId";
    private static final String PROCEDURE = "procedure";
    private static final String CODE = "code";
    private static final String RISK = "risk";
    private static final String DESCRIPTION = "description";
    private static final String CAUSE= "cause";
    private static final String LEGAL_RISK = "legal_risk";
    private static final String OPERATIVE_RISK = "operative_risk";
    private static final String CONTAGIOUS_RISK = "contagious_risk";
    private static final String REPUTATIONAL_RISK = "reputational_risk";
    private static final String RISK_CLIENT = "risk_client";
    private static final String RISK_PRODUCTS = "risk_products";
    private static final String RISK_DISTRIBUTION = "risk_distribution";
    private static final String RISK_JURISDICTION = "risk_jurisdiction";
    private static final String IDENTIFICATION_TO_STRING = "Identification{risk_id='riskId', procedure='procedure', code='code', risk='risk', description='description', cause='cause', legal_risk='legal_risk', operative_risk='operative_risk', contagious_risk='contagious_risk', reputational_risk='reputational_risk', risk_client='risk_client', risk_products='risk_products', risk_distribution='risk_distribution', risk_jurisdiction='risk_jurisdiction'}";

    @Before
    public void setUp() throws Exception {
        identification = new Identification();
    }

    @Test
    public void Identificattion(){
        //When

        identification.setRisk_id(RISK_ID);
        identification.setProcedure(PROCEDURE);
        identification.setCode(CODE);
        identification.setRisk(RISK);
        identification.setDescripcion(DESCRIPTION);
        identification.setCause(CAUSE);
        identification.setLegal_risk(LEGAL_RISK);
        identification.setOperative_risk(OPERATIVE_RISK);
        identification.setContagious_risk(CONTAGIOUS_RISK);
        identification.setReputational_risk(REPUTATIONAL_RISK);
        identification.setRisk_client(RISK_CLIENT);
        identification.setRisk_products(RISK_PRODUCTS);
        identification.setRisk_distribution(RISK_DISTRIBUTION);
        identification.setRisk_jurisdiction(RISK_JURISDICTION);

        // Then

        Assert.assertEquals(identification.getRisk_id(), RISK_ID);
        Assert.assertEquals(identification.getProcedure(), PROCEDURE);
        Assert.assertEquals(identification.getCode(), CODE);
        Assert.assertEquals(identification.getRisk(), RISK);
        Assert.assertEquals(identification.getDescription(), DESCRIPTION);
        Assert.assertEquals(identification.getCause(), CAUSE);
        Assert.assertEquals(identification.getLegal_risks(), LEGAL_RISK);
        Assert.assertEquals(identification.getOperative_risk(), OPERATIVE_RISK);
        Assert.assertEquals(identification.getContagious_risk(), CONTAGIOUS_RISK);
        Assert.assertEquals(identification.getReputational_risk(), REPUTATIONAL_RISK);
        Assert.assertEquals(identification.getRisk_client(), RISK_CLIENT);
        Assert.assertEquals(identification.getRisk_products(), RISK_PRODUCTS);
        Assert.assertEquals(identification.getRisk_distribution(), RISK_DISTRIBUTION);
        Assert.assertEquals(identification.getRisk_jurisdiction(), RISK_JURISDICTION);
        Assert.assertEquals(identification.toString(), IDENTIFICATION_TO_STRING);
    }




}