package org.company.axon.listeners;

import org.axonframework.eventhandling.EventHandler;
import org.company.axon.event.IntegrationEvent;
import org.springframework.stereotype.Service;

@Service
public class IntegrationHandler {
    @EventHandler
    public void on(IntegrationEvent event) {
        //process event
    }
}
