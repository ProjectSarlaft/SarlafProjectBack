package com.BackProject.BackProject.utils;

import com.BackProject.BackProject.dominio.Builders.RiesgoEscalaBuilder;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.dominio.entidades.Riesgo;
import com.BackProject.BackProject.dominio.entidades.RiesgoEscala;

import java.util.List;

import static com.BackProject.BackProject.utils.MatrizRiesgos.getSizeMatriz;

public class PlantillasMatrizRiesgo {

    private static final String TOKEN_CONCATENAR = "x";
    private static final RiesgoEscalaDTO riesgoEscalaBajo = new RiesgoEscalaBuilder().escalaRiesgo("Bajo").colorRiesgo("verde").build();
    private static final RiesgoEscalaDTO riesgoEscalaMedio = new RiesgoEscalaBuilder().escalaRiesgo("Medio").colorRiesgo("amarillo").build();
    private static final RiesgoEscalaDTO riesgoEscalaAlto = new RiesgoEscalaBuilder().escalaRiesgo("Alto").colorRiesgo("naranja").build();
    private static final RiesgoEscalaDTO riesgoEscalaMuyAlto = new RiesgoEscalaBuilder().escalaRiesgo("Muy Alto").colorRiesgo("rojo").build();

    public static List<RiesgoDTO> asignarEscalasRiesgosIniciales(List<RiesgoDTO> riesgos,
                                                              Integer sizeImpacto, Integer sizeProbabilidad) {

        final MatrizRiesgos sizeMatriz = getSizeMatriz(crearCadenaSize(sizeImpacto, sizeProbabilidad));
         switch (sizeMatriz) {
             case CincoXCinco:
                 llenarEscalaRiesgo(riesgos, 0, 2, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 2, 5, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 5, 7, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 7, 9, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 9, 10, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 10, 11, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 11, 13, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 13, 15, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 15, 17, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 17, 19, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 19, 20, riesgoEscalaMuyAlto);
                 llenarEscalaRiesgo(riesgos, 20, 22, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 22, 23, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 23, 25, riesgoEscalaMuyAlto);



                    //    llenarEscalaRiesgo(riesgos,1,2, RiesgoEscala.builder().value("").color().build);

                break;
             case CuatroXCinco:
                 break;
             case TresXCinco:
                 break;
             case CincoXCuatro:
                 break;
             case CuatroXCuatro:
                 break;
             case TresXCuatro:
                 break;
             case CincoXTres:
                 break;
             case CuatroXTres:

                 break;
             case TresXTres:
                 break;
             default:
                 System.out.println("El tamaño no es permitido");
         }

        return riesgos;
    }

    private static void llenarEscalaRiesgo(List<RiesgoDTO> riesgos, Integer posicionInicial,
                                           Integer posicionFinal, RiesgoEscalaDTO riesgoEscalaDTO) {
        riesgos.stream()
                .skip(posicionInicial)
                .limit(posicionFinal - posicionInicial)
                .forEach(riesgo -> riesgo.setRiesgoEscala(riesgoEscalaDTO));
    }

    private static String crearCadenaSize(Integer sizeImpacto, Integer sizeProbabilidad) {
        return sizeImpacto.toString().concat(TOKEN_CONCATENAR).concat(sizeProbabilidad.toString());
    }
}
