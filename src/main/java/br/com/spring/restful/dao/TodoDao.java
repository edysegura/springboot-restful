package br.com.spring.restful.dao;

import java.util.List;
import java.util.Optional;

import br.com.spring.restful.model.Todo;

public interface TodoDao {

  Todo create(Todo todo);

  List<Todo> findAll();

  Optional<Todo> findById(long id);

  Todo update(long id, Todo todo);

  boolean delete(long id);

}