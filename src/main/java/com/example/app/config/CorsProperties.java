package com.example.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.cors")
public class CorsProperties {

    private String pathPattern = "/api/**";

    private final List<String> allowedOrigins = new ArrayList<>(List.of("*"));

    private final List<String> allowedMethods = new ArrayList<>(List.of("GET", "OPTIONS"));

    private final List<String> allowedHeaders = new ArrayList<>(List.of("*"));

    private boolean allowCredentials = false;

    public String getPathPattern() {
        return pathPattern;
    }

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    public List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    public List<String> getAllowedMethods() {
        return allowedMethods;
    }

    public List<String> getAllowedHeaders() {
        return allowedHeaders;
    }

    public boolean isAllowCredentials() {
        return allowCredentials;
    }

    public void setAllowCredentials(boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }
}
