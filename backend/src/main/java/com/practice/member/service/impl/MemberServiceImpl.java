package com.practice.member.service.impl;

import com.practice.member.dto.MemberDto;
import com.practice.member.entity.Member;
import com.practice.member.repository.MemberRepository;
import com.practice.member.service.MemberService;
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
