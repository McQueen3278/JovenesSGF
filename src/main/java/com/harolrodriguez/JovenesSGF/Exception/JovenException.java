package com.harolrodriguez.JovenesSGF.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class JovenException extends RuntimeException{

    public JovenException(String mensaje){
        super(mensaje);
    }
}
