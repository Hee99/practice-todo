package com.practice.todo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.practice.todo.entity.Todo;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TodoDetailDto {

    private Long id;

    private String content;

    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    private LocalDateTime createdDt;

    private String userId;

    private String completeYn;

    public static TodoDetailDto fromEntity(Todo todo) {
        return TodoDetailDto.builder()
                .id(todo.getId())
                .content(todo.getContent())
                .userId(todo.getUserId())
                .createdDt(todo.getCreatedDt())
                .completeYn(todo.getCompleteYn())
                .build();
    }

}
