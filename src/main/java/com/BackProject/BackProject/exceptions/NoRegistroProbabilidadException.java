package com.BackProject.BackProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class NoRegistroProbabilidadException extends RuntimeException {
    public NoRegistroProbabilidadException(){

    }
    public NoRegistroProbabilidadException (String message){
        super(message);
    }
}
