package com.practice.todo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @Comment("사용자아이디")
    private String memberId;

    @Comment("비밀번호")
    private String password;

    @Comment("사용자이름")
    private String name;

    @Comment("성별")
    private String gender;

    @Comment("전화번호")
    private String phone;

    @Comment("이메일")
    private String email;

}
