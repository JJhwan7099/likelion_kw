package com.example.likelion_week3.controller;

import com.example.likelion_week3.dto.RequestDTO;
import com.example.likelion_week3.dto.ResponseDTO;
import com.example.likelion_week3.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/user")
public class Controller {
    HashSet<User> users = new HashSet<>();

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RequestDTO.Register register) {
        User user = register.toEntity();
        ResponseDTO.MyPage mypage = ResponseDTO.MyPage.of(user);
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(mypage);
//        return ResponseEntity.status(HttpStatus.CREATED).body(ResponseDTO.MyPage.of(register.toEntity()));
    }

    @PostMapping("/changepw")
    public ResponseEntity<?> changePw(@RequestBody RequestDTO.ChangePw changePw) {
        if(changePw.getOldPw().equals(changePw.getNewPw()))
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO.Message("성공"));
        else
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDTO.Message("실패"));
    }

    @GetMapping("/mypage")
    public ResponseEntity<?> getMyPage(@RequestBody String name, String phone, String birth, String id, String pw) {
        User user = new User(name, phone, birth, id, pw);
        if(users.contains(user))
            return ResponseEntity.status(HttpStatus.OK).body(ResponseDTO.MyPage.of(user));
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseDTO.Message("실패"));
    }
}
