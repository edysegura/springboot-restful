package br.com.spring.restful.errorhandler;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestExceptionHandler {

  @ExceptionHandler(Throwable.class)
  protected ResponseEntity<GenericErrorResponse> handleException(Throwable e) {
    GenericErrorResponse error = new GenericErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
    return new ResponseEntity<GenericErrorResponse>(error, HttpStatus.BAD_REQUEST);
  }

}
