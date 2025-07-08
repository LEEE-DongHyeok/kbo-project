package com.kbo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data        // MyBatisConfig 클래스에서 get 메소드 사용하기 위해
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceConfig {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
