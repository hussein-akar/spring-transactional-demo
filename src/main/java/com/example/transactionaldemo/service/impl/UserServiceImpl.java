package com.example.transactionaldemo.service.impl;

import com.example.transactionaldemo.domain.Company;
import com.example.transactionaldemo.domain.User;
import com.example.transactionaldemo.payload.UserPayload;
import com.example.transactionaldemo.repository.CompanyRepository;
import com.example.transactionaldemo.repository.UserRepository;
import com.example.transactionaldemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final CompanyRepository companyRepository;
    private final UserRepository userRepository;

    @Transactional
    @Override
    public User submit(UserPayload payload)  {
        Company company = companyRepository.findById(payload.getCompanyId()).orElseThrow(() ->
            new IllegalArgumentException("Invalid company id " + payload.getCompanyId()));

        User user = new User(company, payload.getUsername(), payload.getFirstName(), payload.getLastName());
        userRepository.save(user);

        return user;
    }
}
