package com.practice.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "`user`")
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Comment("이메일")
    private String email;

    @Comment("비밀번호")
    private String password;

    @Comment("사용자이름")
    private String name;

    @Comment("성별")
    private String gender;

    @Comment("전화번호")
    private String phone;

}
