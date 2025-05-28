package com.practice.todo.controller;

import com.practice.todo.dto.*;
import com.practice.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<?> getAllTodos() {
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    @PostMapping
    public ResponseEntity<?> createTodo(@RequestBody TodoCreateRequestDto todoCreateDto) {
        return ResponseEntity.ok(todoService.createTodo(todoCreateDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTodoById(@PathVariable Long id) {
        return ResponseEntity.ok(todoService.getTodoById(id));
    }

    @PutMapping("/{id}/content")
    public ResponseEntity<?> updateContent(@PathVariable Long id, @RequestBody TodoContentUpdateDto dto) {
        todoService.updateContent(id, dto.getContent());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<?> updateComplete(@PathVariable Long id, @RequestBody TodoCompleteUpdateDto dto) {
        todoService.updateComplete(id, dto.getCompleteYn());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok().build();
    }

}
