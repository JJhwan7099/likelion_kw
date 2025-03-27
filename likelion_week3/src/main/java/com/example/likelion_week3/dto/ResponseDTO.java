package com.example.likelion_week3.dto;

import com.example.likelion_week3.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ResponseDTO {

    @Getter
    @AllArgsConstructor
    public static class MyPage{
        private String name;
        private String id;
        private String birth;

        public MyPage(User user) {
            this.name = user.getName();
            this.id = user.getId();
            this.birth = user.getBirth();
        }

        public static MyPage of(User user) {
            return new MyPage(user);
        }
    }

    @AllArgsConstructor
    public static class Message{
        private String Message;
    }
}
