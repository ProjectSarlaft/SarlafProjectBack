package com.BackProject.BackProject.dominio.mapper;

import com.BackProject.BackProject.dominio.dto.IdentificationDTO;
import com.BackProject.BackProject.dominio.entidades.Identification;
import org.springframework.stereotype.Component;

@Component
public class IdentificacionMapper {

    public Identification identificacionDTOToEntity(IdentificationDTO identificationDTO) {
        Identification identification = new Identification();
        identification.setRiesgo(identificationDTO.getRiesgo());
        identification.setDescripcion(identificationDTO.getDescripcion());
        identification.setProceso(identificationDTO.getProceso());
        identification.setRiesgoCliente(identificationDTO.getRiesgoCliente());
        identification.setRiesgoContagio(identificationDTO.getRiesgoContagio());
        identification.setRiesgoDistribucion(identificationDTO.getRiesgoDistribucion());
        identification.setRiesgoJurisdiccion(identificationDTO.getRiesgoJurisdiccion());
        identification.setRiesgoLegal(identificationDTO.getRiesgoLegal());
        identification.setRiesgoOperativo(identificationDTO.getRiesgoOperativo());
        identification.setRiesgoProductos(identificationDTO.getRiesgoProductos());
        identification.setRiesgoReputacional(identificationDTO.getRiesgoReputacional());

        return identification;
    }

    public IdentificationDTO identificacionEntityToDTO(Identification identificacion) {
        IdentificationDTO identificationDto = new IdentificationDTO();
        identificationDto.setRiesgo(identificacion.getRiesgo());
        identificationDto.setDescripcion(identificacion.getDescripcion());
        identificationDto.setProceso(identificacion.getProceso());
        identificationDto.setRiesgoCliente(identificacion.getRiesgoCliente());
        identificationDto.setRiesgoContagio(identificacion.getRiesgoContagio());
        identificationDto.setRiesgoDistribucion(identificacion.getRiesgoDistribucion());
        identificationDto.setRiesgoJurisdiccion(identificacion.getRiesgoJurisdiccion());
        identificationDto.setRiesgoLegal(identificacion.getRiesgoLegal());
        identificationDto.setRiesgoOperativo(identificacion.getRiesgoOperativo());
        identificationDto.setRiesgoProductos(identificacion.getRiesgoProductos());
        identificationDto.setRiesgoReputacional(identificacion.getRiesgoReputacional());

        return identificationDto;
    }
}
