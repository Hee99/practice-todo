package com.practice.todo.service.impl;

import com.practice.todo.dto.MemberDto;
import com.practice.todo.entity.Member;
import com.practice.todo.repository.MemberRepository;
import com.practice.todo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void insertMember(MemberDto memberDto) {
        Member member = Member.builder()
                .memberId(memberDto.getMemberId())
                .email(memberDto.getEmail())
                .password(memberDto.getPassword())
                .gender(memberDto.getGender())
                .phone(memberDto.getPhone())
                .name(memberDto.getName())
                .build();

        memberRepository.save(member);
    }
}
