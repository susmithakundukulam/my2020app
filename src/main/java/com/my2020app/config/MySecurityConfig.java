package com.my2020app.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource secDataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.and()
		.authorizeRequests()
		.antMatchers("/").hasRole("EMPLOYEE")
		.antMatchers("/manager/**").hasRole("MANAGER")
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/showMyLoginPage")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll()
		.and()
		.logout()
		.permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/accessDenied");

	}

	
	@Override 
	protected void configure(AuthenticationManagerBuilder auth) throws
	  	Exception { //add our users for in memory authentication
	  
		  //above spring version 5... withDefaultPasswordEncoder is deprecated . so ignore warning
		  //Rough Code for hard coding login credentials
			/*
			 * UserBuilder users = User.withDefaultPasswordEncoder();
			 * auth.inMemoryAuthentication()
			 * .withUser(users.username("susmitha").password("test123").roles("EMPLOYEE"))
			 * .withUser(users.username("tom").password("test123").roles("EMPLOYEE",
			 * "MANAGER"))
			 * .withUser(users.username("christo").password("test123").roles("ADMIN"));
			 */
		
		 //code for login credentials to get from database		
		System.out.println("************************secDataSource");
		 auth.jdbcAuthentication().dataSource(secDataSource);
		  
	}
	 
	
	
	

}
