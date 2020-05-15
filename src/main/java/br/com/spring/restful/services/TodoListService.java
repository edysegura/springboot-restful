package br.com.spring.restful.services;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.spring.restful.models.Todo;

@Service
public class TodoListService {

  private final ArrayList<Todo> DB;
  private final AtomicLong counter = new AtomicLong();

  public TodoListService() {
    this.DB = new ArrayList<Todo>();
    this.populate();
  }

  private void populate() {
    for (int i = 0; i < 10; i++) {
      long id = counter.incrementAndGet();
      Todo todo = new Todo(id, "Description " + id);
      DB.add(todo);
    }
  }

  public ArrayList<Todo> findAll() {
    return DB;
  }

  public Todo create(Todo todo) {
    long id = counter.incrementAndGet();
    todo.setId(id);
    DB.add(todo);
    return todo;
  }

  public Optional<Todo> findById(long id) {
    return DB.stream()
      .filter(todo -> todo.getId() == id)
      .findFirst();
  }

}
