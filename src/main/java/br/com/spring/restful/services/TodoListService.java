package br.com.spring.restful.services;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.spring.restful.models.Todo;

@Service
public class TodoListService {

  private final ArrayList<Todo> todos;
  private final AtomicLong counter = new AtomicLong();

  public TodoListService() {
    this.todos = new ArrayList<Todo>();
    this.populate();
  }

  private void populate() {
    for (int i = 0; i < 10; i++) {
      Long id = counter.incrementAndGet();
      Todo todo = new Todo(id, "Description " + id);
      todos.add(todo);
    }
  }

  public ArrayList<Todo> findAll() {
    return this.todos;
  }

  public Todo create(Todo todo) {
    Long id = counter.incrementAndGet();
    todo.setId(id);
    todos.add(todo);
    return todo;
  }

  public Todo findById(Long id) {
    for (Todo todo : this.todos) {
        if(todo.getId() == id) {
          return todo;
        }
    }
    return null;
  }

}
