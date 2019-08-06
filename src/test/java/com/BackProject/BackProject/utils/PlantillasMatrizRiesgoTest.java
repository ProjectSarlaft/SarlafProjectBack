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


    //@Test
    public void asignarEscalasRiesgosInicialesTest() {
        // Given
        //   List<Riesgo> listaRiesgo = Arrays.asList(new Riesgo());

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

    @Test
    public void asignarEscalasRiesgoMatriz5x4Test(){
        //Given
        List<RiesgoDTO> riesgos = crearMatriz5x4();

        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 5, 4);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Bajo")).count(), 5);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y-> y.getEscala().equals("Medio")).count(), 7);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Alto")).count(), 5);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Muy Alto")).count(), 3);
    }

    private List<RiesgoDTO> crearMatriz5x4() {
        List<RiesgoDTO> riesgos = Stream.iterate(0, i -> i+1)
                                    .limit(20)
                                    .map(registro -> crearRegistroRiesgo(registro))
                                    .collect(Collectors.toList());
        return riesgos;
    }

    @Test
    public void asignarEscalasRisegoMatriz5x3Test(){

        //Given
        List<RiesgoDTO> riesgos = crearMatriz5x3();

        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 5, 3);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Bajo")).count(), 4);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Medio")).count(), 5);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Alto")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Muy Alto")).count(), 3);
    }

    private List<RiesgoDTO> crearMatriz5x3() {
        List<RiesgoDTO> riesgos = Stream.iterate(0, i -> i+1)
                                                .limit(15)
                                                .map(registro -> crearRegistroRiesgo(registro))
                                                .collect(Collectors.toList());
        return riesgos;
    }

    @Test
    public void asignarEscalasRisegoMatriz4x5Test(){
        //Given
        List<RiesgoDTO> riesgos = crearMatriz4x5();
        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 4, 5);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Bajo")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Medio")).count(), 8);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Alto")).count(), 6);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Muy Alto")).count(), 3);
    }

    private List<RiesgoDTO> crearMatriz4x5() {
        List<RiesgoDTO> riesgos = Stream.iterate(0, i -> i+1)
                                    .limit(20)
                                    .map(registro -> crearRegistroRiesgo(registro))
                                    .collect(Collectors.toList());
        return  riesgos;
    }

    @Test
    public void asignarEscalasRisegoMatriz4x4Test(){
        //Given
        List<RiesgoDTO> riesgos = crearMatriz4x4();
        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 4, 4);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Bajo")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Medio")).count(), 7);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Alto")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Muy Alto")).count(), 3);


}

    private List<RiesgoDTO> crearMatriz4x4() {
        List<RiesgoDTO> riesgos = Stream.iterate(0, i -> i+1)
                                                .limit(16)
                                                .map(registro -> crearRegistroRiesgo(registro))
                                                .collect(Collectors.toList());
        return riesgos;
    }

    @Test
    public void asignarEscalasRisegoMatriz4x3Test(){
        //Given
        List<RiesgoDTO> riesgos = crearMatriz4x3();
        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 4, 3);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Bajo")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Medio")).count(), 4);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Alto")).count(), 2);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(z -> z.getEscala().equals("Muy Alto")).count(), 3);


    }

    private List<RiesgoDTO> crearMatriz4x3() {
        List<RiesgoDTO> riesgos = Stream.iterate(0, i -> i+1)
                .limit(12)
                .map(registro -> crearRegistroRiesgo(registro))
                .collect(Collectors.toList());
        return riesgos;
    }

    @Test
    public void asignarEscalasRiesgosMatriz3x5Test(){
        //Given
        List<RiesgoDTO> riesgos = crearMatriz3x5();

        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 3, 5);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Bajo")).count(), 1);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Medio")).count(), 5);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Alto")).count(), 6);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Muy Alto")).count(), 3);
    }

    private List<RiesgoDTO> crearMatriz3x5() {
        List<RiesgoDTO> riesgos = Stream.iterate(0,i -> i+1)
                                        .limit(15)
                                        .map(registro -> crearRegistroRiesgo(registro))
                                        .collect(Collectors.toList());
        return riesgos;
    }

    @Test
    public void asignarEscalasRiesgoMatriz3x4Test(){
        //Given
        List<RiesgoDTO> riesgos = crearMatriz3x4();
        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 3, 4);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Bajo")).count(), 1);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Medio")).count(), 5);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Alto")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Muy Alto")).count(), 3);
    }

    private List<RiesgoDTO> crearMatriz3x4() {
        List<RiesgoDTO> riesgos = Stream.iterate(0,i -> i+1)
                                        .limit(12)
                                        .map(registro -> crearRegistroRiesgo(registro))
                                        .collect(Collectors.toList());
        return riesgos;
    }

    @Test
    public void asignarEscalasRiesgoMatriz3x3Test(){
        //Given
        List<RiesgoDTO> riesgos = crearMatriz3x3();

        //When
        PlantillasMatrizRiesgo.asignarEscalasRiesgosIniciales(riesgos, 3, 3);

        //Then
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Bajo")).count(), 1);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Medio")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Alto")).count(), 3);
        Assert.assertEquals(riesgos.stream().map(x -> x.getRiesgoEscala()).filter(y -> y.getEscala().equals("Muy Alto")).count(), 2);
    }

    private List<RiesgoDTO> crearMatriz3x3() {
        List<RiesgoDTO> riesgos = Stream.iterate(0,i -> i+1)
                                        .limit(9)
                                        .map(registro -> crearRegistroRiesgo(registro))
                                        .collect(Collectors.toList());
        return riesgos;
    }
}

