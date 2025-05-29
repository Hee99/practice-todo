package com.practice.todo.repository;

import com.practice.todo.entity.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends CrudRepository<Todo, String> {

    List<Todo> findAll();

    Todo save(Todo todo);

    Optional<Todo> findById(Long id);

    List<Todo> findTodosByUserId(String userId);

}
