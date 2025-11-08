package org.company.axon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(AxonConfig.PACKAGE)
public class AxonConfig {
    public static final String PACKAGE = "org.comany.axon";
}
