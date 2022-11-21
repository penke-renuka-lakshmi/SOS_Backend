package com.searchonlinesupervisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin("http://localhost:4200")
@EnableSwagger2
@SpringBootApplication
public class SosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SosApplication.class, args);
	}
	
	@Bean
    public Docket api()
    {
    		return new Docket(DocumentationType.SWAGGER_2).select()
    				.apis(RequestHandlerSelectors.basePackage("com.searchonlinesupervisor.controller"))
    				.build();
    		}
    }

