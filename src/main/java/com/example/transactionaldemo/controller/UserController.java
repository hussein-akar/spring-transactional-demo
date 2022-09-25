package com.example.transactionaldemo.controller;

import com.example.transactionaldemo.domain.User;
import com.example.transactionaldemo.payload.UserPayload;
import com.example.transactionaldemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> submitUser(@RequestBody UserPayload payload) throws Exception {
        User user = userService.submit(payload);

        return ResponseEntity.ok(user);
    }
}
