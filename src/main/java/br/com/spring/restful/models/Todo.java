package br.com.spring.restful.models;

import javax.validation.constraints.NotBlank;

public class Todo {

  private long id;
  @NotBlank
  private String description;
  private boolean done = false;

  public Todo() {
  }

  public Todo(long id, String description) {
    this.id = id;
    this.description = description;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getDone() {
    return this.done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

}
