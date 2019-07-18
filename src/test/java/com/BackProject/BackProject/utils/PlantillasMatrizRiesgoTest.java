package com.BackProject.BackProject.utils;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.entidades.Riesgo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PlantillasMatrizRiesgoTest {


    @Test
    public void asignarEscalasRiesgosInicialesTest() {
        // Given
        List<Riesgo> listaRiesgo = Arrays.asList(new Riesgo());

        //When
       // PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(listaRiesgo, 1, 1);

        //Then

    }

    @Test
    public void asignarEscalasRiesgoMatriz5x5Test() {
        //Given // Arrangement
        List<RiesgoDTO> riesgos = crearMatriz5x5();

        //When // Execution
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos,5,5);

        //Then // Asserts
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Bajo")).count(), 5);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Medio")).count(), 11);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Alto")).count(), 6);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Muy Alto")).count(), 3);

    }

    private List<RiesgoDTO> crearMatriz5x5() {
        List<RiesgoDTO> riesgos =  Stream.iterate(0, i  -> i+1)
                .limit(25)
                .map(registro -> crearRegistroRiesgo(registro))
                .collect(Collectors.toList());

        return riesgos;
    }

    private RiesgoDTO crearRegistroRiesgo(Integer registro) {
        RiesgoDTO riesgoDTO = new RiesgoDTO();
        riesgoDTO.setEscalaProbabilidad(registro.toString());
        riesgoDTO.setEscalaImpacto(registro.toString());
        riesgoDTO.setProbabilidad(new ProbabilidadDTO());
        riesgoDTO.setImpacto(new ImpactoDTO());

        return  riesgoDTO;
    }
}