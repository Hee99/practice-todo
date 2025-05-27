package com.practice.todo.service.impl;

import com.practice.todo.dto.TodoCreateDto;
import com.practice.todo.dto.TodoDetailDto;
import com.practice.todo.dto.TodoListDto;
import com.practice.todo.entity.Todo;
import com.practice.todo.repository.TodoRepository;
import com.practice.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<TodoListDto.Response> getAllTodos() {
        return todoRepository.findAll()
                .stream().map(TodoListDto.Response::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public TodoCreateDto.Response createTodo(TodoCreateDto.Request todoCreateDto) {
        Todo todo = Todo.createTodo(todoCreateDto.getContent(), todoCreateDto.getUserId());
        Todo saved = todoRepository.save(todo);

        return TodoCreateDto.Response.fromEntity(saved);
    }

    @Override
    public TodoDetailDto getTodoById(Long id) {
        Todo todo = findTodoOrThrow(id);
        return TodoDetailDto.fromEntity(todo);
    }

    @Override
    public void updateContent(Long id, String content) {
        Todo todo = findTodoOrThrow(id);
        todo.updateContent(content);
        todoRepository.save(todo);
    }

    @Override
    public void updateComplete(Long id, String completeYn) {
        Todo todo = findTodoOrThrow(id);
        todo.updateComplete(completeYn);
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
        Todo todo = findTodoOrThrow(id);
        todo.deleteTodo();
        todoRepository.save(todo);
    }

    private Todo findTodoOrThrow(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 id입니다."));
    }

}
