package com.bgrulers.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true) // can use @PreAuthorize() with it
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // change validation error responses to be 400 bad request
}