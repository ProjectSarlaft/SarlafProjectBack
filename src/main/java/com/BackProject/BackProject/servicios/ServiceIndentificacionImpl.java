package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.IdentificationDTO;
import com.BackProject.BackProject.dominio.entidades.Identification;
import com.BackProject.BackProject.dominio.mapper.IdentificacionMapper;
import com.BackProject.BackProject.exceptions.InsercionIdentificacionException;
import com.BackProject.BackProject.exceptions.NoRegistroIdentificacionException;
import com.BackProject.BackProject.exceptions.SinRegistrosDeIdentificacionException;
import com.BackProject.BackProject.repositorios.IdentificacionRepositorio;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceIndentificacionImpl implements ServiceIdentificacion {

    private final IdentificacionRepositorio identificacionRepositorio;
    private final IdentificacionMapper identificacionMapper;

    public ServiceIndentificacionImpl(IdentificacionRepositorio identificacionRepositorio, IdentificacionMapper identificacionMapper) {
        this.identificacionRepositorio = identificacionRepositorio;
        this.identificacionMapper = identificacionMapper;
    }

    @Override
    public List<IdentificationDTO> obtenerRegistrosIdentificacion() {
        List<Identification> listaIdentificacionEntidad = identificacionRepositorio.findAll();
        List<IdentificationDTO> listaIdentificacionDTO = listaIdentificacionEntidad.stream()
                        .map(identification -> identificacionMapper.identificacionEntityToDTO(identification))
                        .collect(Collectors.toList());
        if(listaIdentificacionDTO.size() ==0) throw new SinRegistrosDeIdentificacionException();
        return listaIdentificacionDTO;
    }

    @Override
    public IdentificationDTO saveIdentification(IdentificationDTO identificationDTO) {
        Identification identification = identificacionMapper.identificacionDTOToEntity(identificationDTO);
        Identification registroIdentificacionInsertado = identificacionRepositorio.save(identification);
        if (registroIdentificacionInsertado == null) throw new InsercionIdentificacionException();
        return identificacionMapper.identificacionEntityToDTO(registroIdentificacionInsertado);
    }

    @Override
    public void borrarIdentificacion(String riesgo) {
        try {
            identificacionRepositorio.deleteById(riesgo);
        } catch (EmptyResultDataAccessException e) {
            throw new NoRegistroIdentificacionException("No se encontro registro para el Id solicitado");
        }
        }
    }