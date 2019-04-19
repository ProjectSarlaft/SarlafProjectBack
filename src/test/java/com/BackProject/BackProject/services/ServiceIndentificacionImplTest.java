package com.BackProject.BackProject.services;

import com.BackProject.BackProject.domain.Identification;
import com.BackProject.BackProject.repositories.IdentificacionRepositorio;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


public class ServiceIndentificacionImplTest {

    ServiceIdentificacion serviceIndentificacion;
    IdentificacionRepositorio identificacionRepositorio;

    @Before
    public void setUp() throws Exception {
        identificacionRepositorio = Mockito.mock(IdentificacionRepositorio.class);
        serviceIndentificacion = new ServiceIndentificacionImpl(identificacionRepositorio);
    }

    @Test
    public void getAllIdentificationTest() {
        //Given
        Mockito.when(identificacionRepositorio.findAll()).thenReturn(prepareListToReturn());

        //When
        List<Identification> lista = serviceIndentificacion.getAllIdentification();
        
        //Then
        Assert.assertTrue(!lista.isEmpty());
    }

    @Test
    public void saveIdentification(){
        // Given
        Mockito.when(identificacionRepositorio.save(Mockito.any(Identification.class))).thenReturn(new Identification());

        //When
        Identification newIdentification = serviceIndentificacion.saveIdentification(new Identification());

        //Then
        Assert.assertTrue(newIdentification != null);
    }


    private List<Identification> prepareListToReturn() {
        List<Identification> list = new ArrayList<>();

        Identification identificationOne = new Identification();
        identificationOne.setCode("1");
        identificationOne.setCause("causa1");
        identificationOne.setDescripcion("desc1");


        Identification identificationTwo = new Identification();
        identificationTwo.setCode("1");
        identificationTwo.setCause("causa1");
        identificationTwo.setDescripcion("desc1");


        Identification identificationThree = new Identification();
        identificationThree.setCode("1");
        identificationThree.setCause("causa1");
        identificationThree.setDescripcion("desc1");

        list.add(identificationOne);
        list.add(identificationTwo);
        list.add(identificationThree);

        return list;
    }
}