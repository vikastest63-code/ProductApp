package com.product.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {




    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse>getException(ProductNotFoundException  productNotFoundException)
    {


        ErrorResponse errorResponse=new ErrorResponse(productNotFoundException
                .getMessage(), HttpStatus.NOT_FOUND.value(),
                LocalDateTime.now());

        return ResponseEntity.ok().body(errorResponse);
    }
}
