package com.sezo.secuireui.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  {

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authz) -> {
			try {
				authz.requestMatchers("/") .permitAll()
			   .anyRequest().authenticated()
			   .and().oauth2Login();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	
		http.csrf().disable();
		return http.build();
	}




}
