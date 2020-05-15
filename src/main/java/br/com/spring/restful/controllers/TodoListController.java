package br.com.spring.restful.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.restful.models.Todo;
import br.com.spring.restful.services.TodoListService;

@RestController
@RequestMapping("/api/tasks")
public class TodoListController {

  @Autowired
  TodoListService todoListService;

  @GetMapping
  public List<Todo> findAll() {
    return todoListService.findAll();
  }

  @GetMapping(value = "/{id}")
  public Todo getById(@PathVariable final long id) {
    return todoListService.findById(id);
  }

  @PostMapping
  public Todo create(@RequestBody final Todo todo) {
    return todoListService.create(todo);
  }

  @PatchMapping(value = "/{id}")
  public Todo update(@PathVariable final long id, @RequestBody final Todo todo) {
    // TODO update to be implemented
    todo.setId(id);
    return todo;
  }

  @DeleteMapping(value = "/{id}")
  @ResponseStatus(code = HttpStatus.NO_CONTENT)
  public void delete(@PathVariable final long id) {
    // TODO delete to be implemented
  }

}
