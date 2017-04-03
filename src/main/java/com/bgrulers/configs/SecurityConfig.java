package com.bgrulers.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) // can use @PreAuthorize() with it
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
				// TODO - use roles/authorities instead of .authenticated - Admin for http methods
			.antMatchers(HttpMethod.POST, "/api/**").authenticated()
			.antMatchers(HttpMethod.PUT, "/api/**").authenticated()
			.antMatchers(HttpMethod.PATCH, "/api/**").authenticated()
			.antMatchers(HttpMethod.DELETE, "/api/**").authenticated()
			.anyRequest().permitAll()
			.and()
			.httpBasic();
	}
}