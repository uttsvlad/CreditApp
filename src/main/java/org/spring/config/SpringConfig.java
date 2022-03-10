package org.spring.config;

import org.spring.entities.Client.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.spring")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    Client client() {
        return new Client();
    }
}
