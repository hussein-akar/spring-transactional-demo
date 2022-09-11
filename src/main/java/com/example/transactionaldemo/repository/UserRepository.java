package com.example.transactionaldemo.repository;

import com.example.transactionaldemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
