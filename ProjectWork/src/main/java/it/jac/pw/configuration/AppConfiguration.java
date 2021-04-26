package it.jac.pw.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class AppConfiguration extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/user/**").allowedMethods("GET", "POST");
		registry.addMapping("/marche/**").allowedMethods("GET", "POST");
		registry.addMapping("/modelli/**").allowedMethods("GET", "POST");
		registry.addMapping("/motorizzazioni/**").allowedMethods("GET", "POST");
		registry.addMapping("/allestimento/**").allowedMethods("GET", "POST");
		registry.addMapping("/colore/**").allowedMethods("GET", "POST");
		registry.addMapping("/configurazione/**").allowedMethods("GET", "POST");
//		registry.addMapping("/payment/**").allowedMethods("GET", "POST");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers().permitAll()
		.anyRequest().permitAll()
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

	}

	@Bean
	public AuthenticationManager customAuthenticationManager() throws Exception {
		return authenticationManager();
	}

}
