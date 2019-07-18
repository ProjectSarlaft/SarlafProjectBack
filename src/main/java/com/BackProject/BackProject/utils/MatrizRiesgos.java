package com.BackProject.BackProject.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum MatrizRiesgos {
    CincoXCinco("5x5"),
    CuatroXCinco("4x5"),
    TresXCinco("3x5"),
    CincoXCuatro("5x4"),
    CuatroXCuatro("4x4"),
    TresXCuatro("3x4"),
    CincoXTres("5x3"),
    CuatroXTres("4x3"),
    TresXTres("3x3"),
    NO_SOPRTADA("xxx");

    private String value;
    private MatrizRiesgos(String value ){
        this.value = value;
    }

    public static MatrizRiesgos getSizeMatriz(String cadena){
        return Arrays.stream(MatrizRiesgos.values())
                .filter(opcion -> opcion.value.equals(cadena))
                .findFirst().orElse(NO_SOPRTADA);
    }
}
