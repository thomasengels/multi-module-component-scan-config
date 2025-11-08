package org.comany.config;

import org.comany.axon.AxonConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AxonConfig.class)
public class Config {
}
