package com.BackProject.BackProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmptyIdException extends RuntimeException{
    public EmptyIdException() {
    }

    public EmptyIdException(String message) {
        super(message);
    }
}

