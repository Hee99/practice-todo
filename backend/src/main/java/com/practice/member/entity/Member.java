package com.practice.member.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
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
