package org.company.kafka.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(KafkaConfig.PACKAGE)
public class KafkaConfig {
    public static final String PACKAGE = "org.company.kafka";
}
