package com.owltex.shared.exception;

import lombok.AllArgsConstructor;


public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }
}
