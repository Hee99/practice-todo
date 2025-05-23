package com.practice.todo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Comment("내용")
    private String content;

    @Comment("생성일시")
    private String createdDt;

    @Comment("유저아이디")
    private String userId;

    @Comment("완료여부")
    private String completeYn;

    @Comment("삭제여부")
    private String deleteYn;

}
