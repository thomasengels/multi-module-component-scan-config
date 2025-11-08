package org.company.kafka.event;

public record OrderCreatedEvent(String productId, String orderId) {
}
