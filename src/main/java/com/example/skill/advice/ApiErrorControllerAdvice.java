package com.example.skill.advice;

import com.example.skill.error.ApiError;
import com.example.skill.error.EntityNotFoundException;
import com.example.skill.error.ValidationError;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class ApiErrorControllerAdvice extends ResponseEntityExceptionHandler {


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        ApiError apiError = ApiError.builder()
                .status(HttpStatus.BAD_REQUEST)
                .message("Validation Error")
                .subErrors(new ValidationError().getSubErrors(ex))
                .build();
        log.error("Validation Error", ex);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ApiError> handleEntityNotFoundException(EntityNotFoundException ex) {


        return createErrorResponse(HttpStatus.NOT_FOUND, ex);
    }

    private ResponseEntity<ApiError> createErrorResponse(HttpStatus status, Exception ex) {
        ApiError apiError = ApiError.builder()
                .status(status)
                .message(ex.getMessage())
                .build();
        log.error("", ex);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleException(Exception ex) {

        log.error("error", ex);
        return createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex);
    }
}