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
    private static final RiesgoEscalaDTO riesgoEscalaBajo = new RiesgoEscalaBuilder().escalaRiesgo("Bajo").colorRiesgo("#8bc34a").build();
    private static final RiesgoEscalaDTO riesgoEscalaMedio = new RiesgoEscalaBuilder().escalaRiesgo("Medio").colorRiesgo("#cddc39").build();
    private static final RiesgoEscalaDTO riesgoEscalaAlto = new RiesgoEscalaBuilder().escalaRiesgo("Alto").colorRiesgo("#ffc107").build();
    private static final RiesgoEscalaDTO riesgoEscalaMuyAlto = new RiesgoEscalaBuilder().escalaRiesgo("Muy Alto").colorRiesgo("#dd2c00").build();

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
                break;
             case CuatroXCinco:
                 llenarEscalaRiesgo(riesgos, 0, 2, riesgoEscalaBajo );
                 llenarEscalaRiesgo(riesgos, 2, 4, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 4, 5, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 5, 7, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 7, 8, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 8, 10, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 10, 12, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 12, 13, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 13, 15, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 15, 16, riesgoEscalaMuyAlto );
                 llenarEscalaRiesgo(riesgos, 16, 17, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 17, 18, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 18, 20, riesgoEscalaMuyAlto );
                 break;
             case TresXCinco:
                 llenarEscalaRiesgo(riesgos, 0, 1, riesgoEscalaBajo );
                 llenarEscalaRiesgo(riesgos, 1, 5, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 5, 6, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 6, 7, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 7, 11, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 11, 12, riesgoEscalaMuyAlto );
                 llenarEscalaRiesgo(riesgos, 12, 13, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 13, 15, riesgoEscalaMuyAlto );
                 break;
             case CincoXCuatro:
                 llenarEscalaRiesgo(riesgos, 0, 2, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 2, 4, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 4, 5, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 5, 7, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 7, 8, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 8, 10, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 10, 11, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 11, 13, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 13, 14, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 14, 15, riesgoEscalaMuyAlto);
                 llenarEscalaRiesgo(riesgos, 15, 17, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 17, 18, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 18, 20, riesgoEscalaMuyAlto);
                 break;
             case CuatroXCuatro:
                 llenarEscalaRiesgo(riesgos, 0, 2, riesgoEscalaBajo );
                 llenarEscalaRiesgo(riesgos, 2, 4, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 4, 5, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 5, 7, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 7, 8, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 8, 10, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 10, 11, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 11, 12, riesgoEscalaMuyAlto );
                 llenarEscalaRiesgo(riesgos, 12, 13, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 13, 14, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 14, 16, riesgoEscalaMuyAlto);
                 break;
             case TresXCuatro:
                 llenarEscalaRiesgo(riesgos, 0, 1, riesgoEscalaBajo );
                 llenarEscalaRiesgo(riesgos, 1, 5, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 5, 6, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 6, 7, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 7, 8, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 8, 9, riesgoEscalaMuyAlto );
                 llenarEscalaRiesgo(riesgos, 9, 10, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 10, 12, riesgoEscalaMuyAlto );

                 break;
             case CincoXTres:
                 llenarEscalaRiesgo(riesgos, 0, 2, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 2, 4, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 4, 5, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 5, 6, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 6, 8, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 8, 9, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 9, 10, riesgoEscalaMuyAlto);
                 llenarEscalaRiesgo(riesgos, 10, 11, riesgoEscalaBajo);
                 llenarEscalaRiesgo(riesgos, 11, 12, riesgoEscalaMedio);
                 llenarEscalaRiesgo(riesgos, 12, 13, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 13, 15, riesgoEscalaMuyAlto);
                 break;
             case CuatroXTres:
                 llenarEscalaRiesgo(riesgos, 0, 2, riesgoEscalaBajo );
                 llenarEscalaRiesgo(riesgos, 2, 3, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 3, 4, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 4, 5, riesgoEscalaBajo );
                 llenarEscalaRiesgo(riesgos, 5, 7, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 7, 8, riesgoEscalaMuyAlto );
                 llenarEscalaRiesgo(riesgos, 8, 9, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 9, 10, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 10, 12, riesgoEscalaMuyAlto);
                 break;
             case TresXTres:
                 llenarEscalaRiesgo(riesgos, 0, 1, riesgoEscalaBajo );
                 llenarEscalaRiesgo(riesgos, 1, 2, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 2, 3, riesgoEscalaAlto);
                 llenarEscalaRiesgo(riesgos, 3, 5, riesgoEscalaMedio );
                 llenarEscalaRiesgo(riesgos, 5, 6, riesgoEscalaMuyAlto );
                 llenarEscalaRiesgo(riesgos, 6, 8, riesgoEscalaAlto );
                 llenarEscalaRiesgo(riesgos, 8, 9, riesgoEscalaMuyAlto );
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
