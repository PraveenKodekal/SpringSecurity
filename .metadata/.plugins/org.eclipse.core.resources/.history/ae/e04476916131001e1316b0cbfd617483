package com.springSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		/*
		 * This is code will authorize security for all the methods in the project
		 * http.authorizeRequests().anyRequest().authenticated(); http.formLogin();
		 * http.httpBasic();
		 */

		// for customised authorisation
		http.authorizeRequests().antMatchers("/account").authenticated().antMatchers("/loan").authenticated()
				.antMatchers("/emi").authenticated().antMatchers("/balance").authenticated().antMatchers("/")
				.permitAll().antMatchers("/thankYou").permitAll().and().formLogin().and().httpBasic();

	}

}
