package com.kbo;


import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public DataSourceAutoConfiguration dataSourceAutoConfiguration(){
        return new DataSourceAutoConfiguration();
    }

}
