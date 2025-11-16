package com.example.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity //JPA 엔티티임을 나타냄. 필수조건 -> 기본 생성자 필요, @ID가 반드시 하나 있어야 함.
@Table(name = "member") // 엔티티가 어떤 테이블과 매핑될지 지정 , 지정하지 않으면 클래스명 사용
@Getter // 모든 필드의 Getter 메서드 자동 생성
@NoArgsConstructor  //Lombok: 기본 생성자, JPA가 엔티티를 생성할 때 반드시 필요
@AllArgsConstructor //Lombok: 모든 필드를 매개변수로 받는 생성자 자동 생성
@Builder // 객체를 빌더 패턴으로 생성 가능하게 해줌

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column
    private Integer age;

    @Column(unique = true, length = 100)
    private String email;
}
