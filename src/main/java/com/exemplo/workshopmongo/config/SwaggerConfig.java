package com.exemplo.workshopmongo.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.ModelRendering;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.exemplo.workshopmongo.resources"))
              //  .paths(regex("/users.*"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }
	
	@Bean
	UiConfiguration uiConfig() {
	return UiConfigurationBuilder.builder().deepLinking(true).displayOperationId(false).defaultModelsExpandDepth(5).defaultModelExpandDepth(5).defaultModelRendering(ModelRendering.MODEL)
	.displayRequestDuration(false).docExpansion(DocExpansion.LIST).filter(false).maxDisplayedTags(null).operationsSorter(OperationsSorter.ALPHA)
	.showExtensions(true).tagsSorter(TagsSorter.ALPHA).validatorUrl(null).build();
	}	

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Projeto Cadastro de Usuários",
                "API REST de cadastro de usuários",
                "1.0",
                "Terms of Service",
                new Contact("Rubens Bento Jr", "https://www.youtube.com/channel/UClSS1k7txx9Wlw3ncEDJMYA",
                        "rubens.bento@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;

    }    
}
