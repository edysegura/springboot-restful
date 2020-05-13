package br.com.spring.restful.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.restful.models.Todo;

@RestController
@RequestMapping("/api")
public class TodoListController {

  @GetMapping(value = "/tasks")
  public String findAll() {
    return "Hi there!";
  }

  @GetMapping(value = "/tasks/{id}")
  public Todo getById(@PathVariable(value = "id") Long id) {
    Todo todo = new Todo();
    todo.setId(id);
    todo.setDescription("Learn Spring Boot!");
    return todo;
  }

}