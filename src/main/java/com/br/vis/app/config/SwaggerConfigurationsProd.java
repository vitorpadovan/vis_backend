package com.br.vis.app.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfigurationsProd {

	@Bean
	@Profile({ "default", "prod" })
	public Docket forumApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.br.vis.api.java.loja")).paths(PathSelectors.ant("/**"))
				.build()
				.globalOperationParameters(
						Arrays.asList(new ParameterBuilder().name("Authorization").description("Header para token JWT")
								.modelRef(new ModelRef("string")).parameterType("header").required(false).build()))

		;
	}
}
