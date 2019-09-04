package org.origel.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = JadeProperties.MYBATIS_PREFIX)
public class JadeProperties {
    public static final String JADE_PREFIX = "jade";

    private String configLocation;

    public String getConfigLocation() {
        return configLocation;
    }

    public void setConfigLocation(String configLocation) {
        this.configLocation = configLocation;
    }
}
