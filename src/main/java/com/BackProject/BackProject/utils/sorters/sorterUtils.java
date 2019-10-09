package com.BackProject.BackProject.utils.sorters;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.entidades.Impacto;
import com.BackProject.BackProject.dominio.entidades.Probabilidad;

import java.util.Comparator;

public class sorterUtils {

    public static Comparator<ImpactoDTO> organizarImpactos = ((ImpactoDTO impactoUno, ImpactoDTO impactoDos)
            -> impactoUno.getNivel().compareTo(impactoDos.getNivel()));

    public static Comparator<ProbabilidadDTO> organizarProbabilidad = ((ProbabilidadDTO probabilidadUNo, ProbabilidadDTO probabilidadDos)
            -> probabilidadUNo.getNivel().compareTo((probabilidadDos.getNivel())));

    public static Comparator<RiesgoDTO> organizarMatrizRiesgo = (RiesgoDTO riesgoUno, RiesgoDTO riesgoDos)
            -> riesgoDos.getImpacto().getNivel().compareTo(riesgoUno.getImpacto().getNivel());
}
