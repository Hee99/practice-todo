package com.practice.todo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.practice.todo.entity.Todo;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

public class TodoCreateDto {

    @Data
    @Builder
    public static class Request {

        private String content;

        private String userId;

    }

    @Data
    @Builder
    public static class Response {

        private Long id;

        private String content;

        @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
        private LocalDateTime createdDt;

        private String userId;

        private String completeYn;

        private String deleteYn;

        public static TodoCreateDto.Response fromEntity(Todo todo) {
            return Response.builder()
                    .id(todo.getId())
                    .content(todo.getContent())
                    .userId(todo.getUserId())
                    .createdDt(todo.getCreatedDt())
                    .completeYn(todo.getCompleteYn())
                    .deleteYn(todo.getDeleteYn())
                    .build();
        }

    }
}
