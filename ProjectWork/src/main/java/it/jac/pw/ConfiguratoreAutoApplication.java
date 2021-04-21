package it.jac.pw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "it.jac.pw")
public class ConfiguratoreAutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguratoreAutoApplication.class, args);
	}

}
