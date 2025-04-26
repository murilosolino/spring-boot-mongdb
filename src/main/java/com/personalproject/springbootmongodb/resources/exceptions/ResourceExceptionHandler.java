package com.personalproject.springbootmongodb.resources.exceptions;

import com.personalproject.springbootmongodb.service.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StandartError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandartError standartError = new StandartError(Instant.now(),status.value(), "NOT FOUND", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(standartError);
    }


}
