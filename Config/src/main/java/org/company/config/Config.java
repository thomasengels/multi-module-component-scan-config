package org.company.config;

import org.company.axon.AxonConfig;
import org.company.kafka.config.KafkaConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AxonConfig.class,
        KafkaConfig.class
})
public class Config {
}
