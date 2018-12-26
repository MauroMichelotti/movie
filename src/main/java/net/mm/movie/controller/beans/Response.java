package net.mm.movie.controller.beans;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Response {

  private Boolean result;

  private String description;

  private Integer errorCode;

  public Response() {
  }

  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  @Override
  public String toString() {
    ObjectMapper mapper = new ObjectMapper();
    String ret = "";
    try {
      ret = mapper.writeValueAsString(this);
    } catch (JsonProcessingException e) {
      System.err.println("ERRORE");
      e.printStackTrace();
      ret = e.getMessage();
    }
    return ret;
  }

}
