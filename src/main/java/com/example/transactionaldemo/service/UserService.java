package com.example.transactionaldemo.service;

import com.example.transactionaldemo.domain.User;
import com.example.transactionaldemo.payload.UserPayload;

public interface UserService {

    User submit(UserPayload payload) throws Exception;
}
