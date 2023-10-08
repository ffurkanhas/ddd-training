package com.trendyol.tacticaldddecommerce.event;

import java.time.LocalDateTime;
import java.util.UUID;

public class OrderCreatedEvent {
    private final UUID orderId;
    private final UUID customerId;
    private final LocalDateTime createdDate;

    public OrderCreatedEvent(UUID orderId, UUID customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.createdDate = LocalDateTime.now();
    }

    public UUID getOrderId() {
        return orderId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "OrderPlacedEvent{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", occurredOn=" + createdDate +
                '}';
    }
}






