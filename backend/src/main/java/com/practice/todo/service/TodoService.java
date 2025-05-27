package com.practice.todo.service;

import com.practice.todo.dto.TodoCreateDto;
import com.practice.todo.dto.TodoDetailDto;
import com.practice.todo.dto.TodoListDto;
import com.practice.todo.entity.Todo;

import java.util.List;

public interface TodoService {

    List<TodoListDto.Response> getAllTodos();

    TodoCreateDto.Response createTodo(TodoCreateDto.Request todoCreateDto);

    TodoDetailDto getTodoById(Long id);

    void updateContent(Long id, String content);

    void updateComplete(Long id, String completeYn);

    void deleteTodo(Long id);
}
