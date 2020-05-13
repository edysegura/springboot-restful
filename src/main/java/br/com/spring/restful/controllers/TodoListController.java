package br.com.spring.restful.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.restful.models.Todo;

@RestController
@RequestMapping("/api/tasks")
public class TodoListController {

  @GetMapping()
  public String findAll() {
    return "Hi there! Tasks will be listed here soon!";
  }

  @GetMapping(value = "/{id}")
  public Todo getById(@PathVariable(value = "id") Long id) {
    Todo todo = new Todo();
    todo.setId(id);
    todo.setDescription("Learn Spring Boot!");
    return todo;
  }

  @PostMapping()
  public Todo create(@RequestBody Todo entity) {
    entity.setId(32L);
    return entity;
  }

  @PatchMapping(value = "/{id}")
  public Todo update(@PathVariable Long id, @RequestBody Todo entity) {
    entity.setId(id);
    return entity;
  }

  @DeleteMapping(value = "/{id}")
  public String delete(@PathVariable Long id) {
    return "Ok";
  }
}
