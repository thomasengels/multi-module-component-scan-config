package org.comany.kafka.event;

public record OrderCreatedEvent(String productId, String orderId) {
}
