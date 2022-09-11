package com.example.transactionaldemo.domain;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_AUDIT")
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "trace_id", nullable = false, length = 100)
    private String traceId;

    @Column(nullable = false, length = 50)
    private String eventName;

    @Column(columnDefinition = "TEXT")
    private String payload;

    private Instant createdOn;


    protected Audit() {

    }

    public Audit(String traceId, String eventName, String payload, Instant createdOn) {
        this.traceId = traceId;
        this.eventName = eventName;
        this.payload = payload;
        this.createdOn = createdOn;
    }

    public long getId() {
        return id;
    }

    public String getTraceId() {
        return traceId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getPayload() {
        return payload;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }
}
