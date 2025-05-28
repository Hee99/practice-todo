package com.practice.todo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.practice.todo.entity.Todo;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TodoListResponseDto {

    private Long id;

    private String content;

    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    private LocalDateTime createdDt;

    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    private LocalDateTime updatedDt;

    private String userId;

    private String completeYn;

    private String deleteYn;

    public static TodoListResponseDto fromEntity(Todo todo) {
        return TodoListResponseDto.builder()
                .id(todo.getId())
                .content(todo.getContent())
                .userId(todo.getUserId())
                .createdDt(todo.getCreatedDt())
                .updatedDt(todo.getUpdatedDt())
                .completeYn(todo.getCompleteYn())
                .deleteYn(todo.getDeleteYn())
                .build();
    }

}
