package com.practice.todo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("내용")
    private String content;

    @CreationTimestamp
    @Comment("생성일시")
    private LocalDateTime createdDt;

    @UpdateTimestamp
    @Comment("변경일시")
    private LocalDateTime updatedDt;

    @Comment("유저아이디")
    private String userId;

    @Comment("완료여부")
    private String completeYn;

    @Comment("삭제여부")
    private String deleteYn;

    private Todo(String content, String userId, String completeYn, String deleteYn) {
        this.content = content;
        this.userId = userId;
        this.completeYn = completeYn;
        this.deleteYn = deleteYn;
    }

    public static Todo createTodo(String content, String userId) {
        return new Todo(content, userId, "N", "N");
    }

    private void setContent(String content) {
        this.content = content;
    }

    private void setCompleteYn(String completeYn) {
        this.completeYn = completeYn;
    }

    private void setDeleteYn(String deleteYn) {
        this.deleteYn = deleteYn;
    }

    public void updateContent(String content) {
        setContent(content);
    }

    public void updateComplete(String completeYn) {
        setCompleteYn(completeYn);
    }

    public void deleteTodo() {
        setDeleteYn("Y");
    }

}
