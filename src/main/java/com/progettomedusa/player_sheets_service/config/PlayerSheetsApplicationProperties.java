package com.progettomedusa.player_sheets_service.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "spring.application")
public class PlayerSheetsApplicationProperties {
    private String name;
}