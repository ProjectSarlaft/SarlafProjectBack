package com.BackProject.BackProject.services;

import com.BackProject.BackProject.domain.Identification;

import java.util.List;

public interface ServiceIdentificacion {
    List<Identification> getAllIdentification();

    Identification saveIdentification(Identification newIdentification);

}
