package com.halo.hello;

import com.halo.hello.constant.SpringDataJPAMultitenantConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		HelloApplication.class,
		Jsr310JpaConverters.class
})
@RestController
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Bean
	@Profile("default")
	public SpringDataJPAMultitenantConstants localTenant() {
		SpringDataJPAMultitenantConstants.DEFAULT_TENANT_ID ="testhello";
		return new SpringDataJPAMultitenantConstants();}

	@Bean
	@Profile("heroku")
	public SpringDataJPAMultitenantConstants herokuTenant() {
		SpringDataJPAMultitenantConstants.DEFAULT_TENANT_ID ="dfn3qk4nu6ovn5";
		return new SpringDataJPAMultitenantConstants();}
}
