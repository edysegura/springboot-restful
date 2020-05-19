package br.com.spring.restful.errorhandler;

import org.springframework.http.HttpStatus;

public class GenericErrorResponse {

  private int httpCode = 400;
  private String status = "";
  private String message = "";

  public GenericErrorResponse(HttpStatus httpStatus, String message) {
    this.httpCode = httpStatus.value();
    this.status = httpStatus.getReasonPhrase();
    this.message = message;
  }

  public int getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(int httpCode) {
    this.httpCode = httpCode;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}