package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoDTO;
import com.BackProject.BackProject.dominio.dto.RiesgoEscalaDTO;
import com.BackProject.BackProject.servicios.ServiceRiesgo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class RiesgoControlador {

    private final ServiceRiesgo serviceRiesgo;

    public RiesgoControlador(ServiceRiesgo serviceRiesgo) {
        this.serviceRiesgo = serviceRiesgo;
    }

    @CrossOrigin
    @GetMapping("/riesgo")
    @ResponseStatus(HttpStatus.OK)
    public List<RiesgoDTO> crearMatrizRiesgo(){
        /*ImpactoDTO impactoMock = new ImpactoDTO();
        impactoMock.setEscala("LOW");
        impactoMock.setNivel("1");
        impactoMock.setAfectacionEconomica("AA");

        ProbabilidadDTO probabilidadDTOMock = new ProbabilidadDTO();
        probabilidadDTOMock.setEscala("BAJIT");
        probabilidadDTOMock.setNivel("2");
        probabilidadDTOMock.setPosibilidadAnual("1");

        RiesgoDTO riesgoNumOne = new RiesgoDTO();
        riesgoNumOne.setEscalaImpacto("Escala Impacto 1");
        riesgoNumOne.setEscalaProbabilidad("Escala Probabilidad 1");
        riesgoNumOne.setImpacto(impactoMock);
        riesgoNumOne.setProbabilidad(probabilidadDTOMock);

        RiesgoDTO riesgoNumTwo = new RiesgoDTO();
        riesgoNumTwo.setEscalaImpacto("Escala Impacto 2");
        riesgoNumTwo.setEscalaProbabilidad("Escala Probabilidad 2");
        riesgoNumTwo.setImpacto(impactoMock);
        riesgoNumTwo.setProbabilidad(probabilidadDTOMock);

        return Arrays.asList(riesgoNumOne, riesgoNumTwo);
        */
        return serviceRiesgo.crearMatrizRiesgo();

    }

    @CrossOrigin
    @GetMapping("/riesgoEscala")
    @ResponseStatus(HttpStatus.OK)
    public List<RiesgoEscalaDTO> recuperarRiesgoEscala(){
        return serviceRiesgo.retornarRiesgoEscala();
    }

    @CrossOrigin
    @DeleteMapping("/riesgo/{riesgoEscala}")
    @ResponseStatus (HttpStatus.OK)
    public void borrarRiesgoEscala(@PathVariable String escala){
         serviceRiesgo.borrarRiesgoEscala(escala);
    }

    @CrossOrigin
    @PostMapping("/riesgoEscala")
    @ResponseStatus(HttpStatus.CREATED)
    public RiesgoEscalaDTO crearRiesgoEscala(@Valid @RequestBody RiesgoEscalaDTO riesgoEscalaDTO){
        return serviceRiesgo.guardarRiesgoEscala(riesgoEscalaDTO);
    }
}
