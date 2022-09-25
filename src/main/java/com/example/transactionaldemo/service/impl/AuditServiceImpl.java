package com.example.transactionaldemo.service.impl;

import com.example.transactionaldemo.domain.Audit;
import com.example.transactionaldemo.payload.UserPayload;
import com.example.transactionaldemo.repository.AuditRepository;
import com.example.transactionaldemo.service.AuditService;
import java.time.Instant;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuditServiceImpl implements AuditService {

    private final AuditRepository auditRepository;

    public AuditServiceImpl(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void submitAudit(UserPayload payload) {
        Audit audit = new Audit(UUID.randomUUID().toString(), "User Created", payload.toString(), Instant.now());
        auditRepository.save(audit);
    }
}
