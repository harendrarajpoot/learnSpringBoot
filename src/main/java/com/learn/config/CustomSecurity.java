package com.learn.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
public class CustomSecurity {

	
	// 2nd way to create in-memory user 
	
	@Bean
	public InMemoryUserDetailsManager getUserDetails()
	{
		UserDetails user = User.withDefaultPasswordEncoder().username("komal").password("1234").roles("USER").build();
		UserDetails admin = User.withDefaultPasswordEncoder().username("harendra").password("1234").roles("ADMIN").build();
		
		return new InMemoryUserDetailsManager(user,admin);
		
	}
}
