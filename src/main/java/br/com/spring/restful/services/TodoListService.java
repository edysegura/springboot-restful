package br.com.spring.restful.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.spring.restful.dao.TodoDao;
import br.com.spring.restful.model.Todo;

@Service
public class TodoListService {

  private final TodoDao todoDao;

  @Autowired
  public TodoListService(@Qualifier("memoryDB") TodoDao todoDao) {
    this.todoDao = todoDao;
    this.populate();
  }

  private void populate() {
    for (int i = 1; i < 11; i++) {
      Todo item = new Todo("Description " + i);
      todoDao.create(item);
    }
  }

  public List<Todo> findAll() {
    return todoDao.findAll();
  }

  public Todo create(Todo item) {
    return todoDao.create(item);
  }

  public Optional<Todo> findById(long id) {
    return todoDao.findById(id);
  }

  public Todo update(final long id, final Todo item) {
    return todoDao.update(id, item);
  }

  public boolean delete(final long id) {
    return todoDao.delete(id);
  }

}
