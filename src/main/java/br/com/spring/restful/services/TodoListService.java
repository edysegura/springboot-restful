package br.com.spring.restful.services;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

import br.com.spring.restful.models.Todo;

@Component
public class TodoListService {

  private final ArrayList<Todo> todos;

  public TodoListService() {
    this.todos = new ArrayList<Todo>();
    this.populate();
  }

  private void populate() {
    for (int i = 0; i < 10; i++) {
      String id = Integer.toString(i + 1);
      Todo todo = new Todo(id, "Description " + id);
      todos.add(todo);
    }
  }

  public ArrayList<Todo> findAll() {
    return this.todos;
  }

  public Todo create(Todo todo) {
    String id = Integer.toString(todos.size() + 1);
    todo.setId(id);
    todos.add(todo);
    return todo;
  }

  public Todo findById(String id) {
    for (Todo todo : this.todos) {
        if(todo.getId().equals(id)) {
          return todo;
        }
    }
    return new Todo();
  }

}
