package com.practice.todo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoCreateRequestDto {

    private String content;

    private String userId;

}
