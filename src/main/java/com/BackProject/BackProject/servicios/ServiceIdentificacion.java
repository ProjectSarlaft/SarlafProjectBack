package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.IdentificationDTO;
import com.BackProject.BackProject.dominio.entidades.Identification;

import java.util.List;

public interface ServiceIdentificacion {

    IdentificationDTO saveIdentification(IdentificationDTO identificacion);

    List<IdentificationDTO> obtenerRegistrosIdentificacion();
}
