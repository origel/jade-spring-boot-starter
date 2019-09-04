package org.origel.jade.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = JadeProperties.JADE_PREFIX)
public class JadeProperties {
    public static final String JADE_PREFIX = "spring.jade";

    private String configLocation;

    public String getConfigLocation() {
        return configLocation;
    }

    public void setConfigLocation(String configLocation) {
        this.configLocation = configLocation;
    }
}
