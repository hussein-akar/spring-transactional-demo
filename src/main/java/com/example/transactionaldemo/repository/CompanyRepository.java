package com.example.transactionaldemo.repository;

import com.example.transactionaldemo.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
