package com.order.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication(exclude = { UserDetailsServiceAutoConfiguration.class })
public class OrderECommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderECommerceApplication.class, args);
    }

    @Configuration
    @ConditionalOnMissingBean(UserDetailsService.class)
    public class UserDetailsServiceConfig {

    }

}