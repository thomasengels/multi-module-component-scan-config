package org.company.kafka.consumers;

import org.company.kafka.event.OrderCreatedEvent;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(autoStartup = "true", topics = {"order-created-topic"})
public class OrderCreatedConsumer {
    @KafkaHandler
    public void handle(@Payload OrderCreatedEvent orderCreated) {
        //process packing order
    }
}
