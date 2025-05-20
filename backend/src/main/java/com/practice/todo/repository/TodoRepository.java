package com.practice.todo.repository;

import com.practice.todo.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, String> {
}
