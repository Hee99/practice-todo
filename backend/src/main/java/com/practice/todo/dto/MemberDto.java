package com.practice.todo.dto;

import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Data
public class MemberDto {

    private String memberId;

    private String password;

    private String name;

    private String gender;

    private String phone;

    private String email;

}
