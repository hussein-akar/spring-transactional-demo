package com.example.transactionaldemo.controller;

import com.example.transactionaldemo.payload.UserPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

    @PostMapping
    public ResponseEntity submitUser(@RequestBody UserPayload payload) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
