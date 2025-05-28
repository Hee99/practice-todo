package com.practice.todo.service;

import com.practice.todo.dto.*;

import java.util.List;

public interface TodoService {

    List<TodoListResponseDto> getAllTodos();

    TodoCreateResponseDto createTodo(TodoCreateRequestDto todoCreateDto);

    TodoDetailDto getTodoById(Long id);

    void updateContent(Long id, String content);

    void updateComplete(Long id, String completeYn);

    void deleteTodo(Long id);
}
