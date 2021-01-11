package com.br.vis.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecutiryConfig extends WebSecurityConfigurerAdapter {
	
	private static final String[] ACESSOS_PUBLICOS = {};
	private static final String[] ACESSOS_APENAS_GET = {};
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.cors().and().csrf().disable();
		http.authorizeRequests()
		.antMatchers(ACESSOS_PUBLICOS).permitAll() //Libera todos os acessos público
		.antMatchers(HttpMethod.GET, ACESSOS_APENAS_GET).permitAll() //Libera os acessos públicos
		.anyRequest().authenticated() //Qualquer outra requisição deve ser validada pelo login
		;
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); //Assegura que a sessão não será armazenada
	}
	
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
