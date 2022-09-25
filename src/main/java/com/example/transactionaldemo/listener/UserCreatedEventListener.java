package com.example.transactionaldemo.listener;

import com.example.transactionaldemo.repository.AuditRepository;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventListener {

    private final AuditRepository auditRepository;

    public UserCreatedEventListener(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }
}
