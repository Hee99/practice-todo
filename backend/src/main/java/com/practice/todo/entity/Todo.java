package com.practice.todo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Data
@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "content")
    @Comment("내용")
    private String content;

    @Column(name = "created_dt")
    @Comment("생성일시")
    private String createdDt;

    @Column(name = "user_id")
    @Comment("유저아이디")
    private String userId;

    @Column(name = "complete_yn")
    @Comment("완료여부")
    private String completeYn;

    @Column(name = "delete_yn")
    @Comment("삭제여부")
    private String deleteYn;

}
