package com.practice.todo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.practice.todo.entity.Todo;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

public class TodoListDto {

    @Data
    @Builder
    public static class Request {

        private String userId;

        private String createdDt;

        private String completeYn;

        private String deleteYn;

    }

    @Data
    @Builder
    public static class Response {

        private Long id;

        private String content;

        @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
        private LocalDateTime createdDt;

        @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
        private LocalDateTime updatedDt;

        private String userId;

        private String completeYn;

        private String deleteYn;

        public static TodoListDto.Response fromEntity(Todo todo) {
            return Response.builder()
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
}
