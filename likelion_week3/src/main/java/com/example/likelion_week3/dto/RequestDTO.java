package com.example.likelion_week3.dto;

import com.example.likelion_week3.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class RequestDTO {
    // 아리 2개 어노테이션은 요청일때 사용
    @Getter
    @NoArgsConstructor
    public static class Register{
        private String name;
        private String birth;
        private String phone;
        private String id;
        private String pw;

        public Register(String name, String birth, String phone, String id, String pw) {
            this.name = name;
            this.birth = birth;
            this.phone = phone;
            this.id = id;
            this.pw = pw;
        }

        public User toEntity(){
            return new User(this.name, this.birth, this.phone, this.id, this.pw);
        }
    }

    @Getter
    @NoArgsConstructor
    public static class ChangePw {
        private String oldPw;
        private String newPw;
        public ChangePw(String oldPw, String newPw) {
            this.oldPw = oldPw;
            this.newPw = newPw;
        }
    }
}
