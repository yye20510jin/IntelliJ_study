package com.example.test.java;

import com.example.test.entity.Member;
import com.example.test.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData implements CommandLineRunner {
    private final MemberRepository memberRepository;

    @Override
    public void run(String...args){
        //Member m = Member.builder().name("홍길동").age(25).email("test@example.com").build();

        //memberRepository.save(m);
    }
}
