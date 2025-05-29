package com.practice.todo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoListRequestDto {

    private String userId;

    private String createdDt;

    private String completeYn;

    private String deleteYn;

}
