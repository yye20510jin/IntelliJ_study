package com.example.test.dto;

import lombok.Data;

@Data
public class LoginDTO {
    private String id;
    private String password;
}


/*
* @Data 만 쓰면:
* - getter / setter 자동 생성
* - toString 자동 생성
* - equals/hashCode 자동 생성
* */