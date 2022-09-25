package com.example.transactionaldemo.service;

import com.example.transactionaldemo.payload.UserPayload;

public interface AuditService {

    void submitAudit(UserPayload payload);
}
