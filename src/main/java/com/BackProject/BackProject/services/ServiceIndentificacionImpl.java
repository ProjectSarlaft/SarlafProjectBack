package com.BackProject.BackProject.services;

import com.BackProject.BackProject.domain.Identification;
import com.BackProject.BackProject.repositories.IdentificacionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIndentificacionImpl implements ServiceIdentificacion {
    private final IdentificacionRepositorio repositorio;

    public ServiceIndentificacionImpl(IdentificacionRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    @Override
    public List<Identification> getAllIdentification() {
        List<Identification> identificationList = repositorio.findAll();
        return identificationList;
    }

    @Override
    public Identification saveIdentification(Identification newIdentification) {
        return repositorio.save(newIdentification);
    }

}
