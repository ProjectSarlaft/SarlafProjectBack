package com.BackProject.BackProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SinRegistrosDeIdentificacionException extends RuntimeException{

    public SinRegistrosDeIdentificacionException() {
    }

    public SinRegistrosDeIdentificacionException(String message) {
        super(message);
    }
}
