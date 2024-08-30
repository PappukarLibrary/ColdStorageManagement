package com.example.management;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrfConfigurer -> csrfConfigurer.disable()) // Updated way to disable CSRF
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/orders/**").permitAll()   // Replacing antMatchers with requestMatchers
                        .anyRequest().authenticated()                // Require authentication for all other requests
                )
                .httpBasic(withDefaults()); // Updated way to configure HTTP Basic authentication
        return http.build();
    }
}