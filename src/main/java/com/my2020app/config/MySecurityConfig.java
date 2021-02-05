package com.my2020app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//add our users for in memory authentication
		
		//above spring version 5... withDefaultPasswordEncoder is deprecated . so ignore warning
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("susmitha").password("test123").roles("EMPLOYEE"))
		.withUser(users.username("tom").password("test123").roles("MANAGER"))
		.withUser(users.username("christo").password("test123").roles("ADMIN"));
		
	}
	
	

}
