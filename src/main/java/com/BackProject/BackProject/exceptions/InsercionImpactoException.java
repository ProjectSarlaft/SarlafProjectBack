package com.BackProject.BackProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InsercionImpactoException extends RuntimeException {

    public InsercionImpactoException(){
    }
    public InsercionImpactoException(String message) {
        super(message);
    }
}


