package com.springmvc.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@ComponentScan(basePackages= {"com.learn.*", "com.learn.*.*"})
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	 DataSource dataSource;
 
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("shashank").password("password").roles("USER", "ADMIN")
	.and().withUser("admin").password("password").roles("USER","ADMIN")
	.and().withUser("user").password("password").roles("USER");
	}
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll()
		.antMatchers("/", "/*todo*/**","/*event*/**","/*user*/**","/*admin*/**").access("hasRole('ROLE_ADMIN')")
		.antMatchers("/", "/*todo*/**","/*event*/**","/*user*/**").access("hasRole('USER')")
		.and().exceptionHandling().accessDeniedPage("/accessDenied")
		.and().formLogin();
	}
}	