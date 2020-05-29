package br.com.spring.restful.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import br.com.spring.restful.model.Todo;

@Repository("memoryDB")
public class TodoDaoMemoryDB implements TodoDao {

  private final static AtomicLong counter = new AtomicLong(1);
  private final static List<Todo> DB = new ArrayList<Todo>();

  @Override
  public Todo create(final Todo item) {
    final long id = counter.getAndIncrement();
    item.setId(id);
    DB.add(item);
    return item;
  }

  @Override
  public boolean delete(final long id) {
    Optional<Todo> itemOptional = findById(id);
    if (itemOptional.isPresent()) {
      return DB.remove(itemOptional.get());
    }
    return false;
  }

  @Override
  public List<Todo> findAll() {
    return DB;
  }

  @Override
  public Optional<Todo> findById(final long id) {
    return DB
      .stream()
      .filter(todo -> todo.getId() == id)
      .findFirst();
  }

  @Override
  public Todo update(final long id, final Todo itemUpdate) {
    Optional<Todo> itemOptional = findById(id);
    if (itemOptional.isPresent()) {
      Todo item = itemOptional.get();
      item.setDescription(itemUpdate.getDescription());
      item.setDone(itemUpdate.getDone());
      return item;
    }
    return null;
  }

}