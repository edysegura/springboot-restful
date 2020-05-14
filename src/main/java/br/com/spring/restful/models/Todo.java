package br.com.spring.restful.models;

public class Todo {

  private Long id;
  private String description;
  private Boolean done = false;

  public Todo() {
  }

  public Todo(Long id, String description) {
    this.id = id;
    this.description = description;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getDone() {
    return this.done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

}
