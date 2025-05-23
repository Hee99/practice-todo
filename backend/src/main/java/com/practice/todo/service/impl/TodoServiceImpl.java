package com.practice.todo.service.impl;

import com.practice.todo.entity.Todo;
import com.practice.todo.repository.TodoRepository;
import com.practice.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        return List.of();
    }

}
