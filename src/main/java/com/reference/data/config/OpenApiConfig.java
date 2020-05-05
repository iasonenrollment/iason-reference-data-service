package com.reference.data.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: OpenApiConfig
 * Inside the package - com.reference.data.config
 * Created Date: 5/4/2020
 * Created Time: 3:38 PM
 **/
@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customConfiguration(){
        List<Server> serverList = new ArrayList<>();
        serverList.add(new Server().url("http://localhost:8080").description("Development Server"));
        serverList.add(new Server().url("http://qa.iason-reference-data-service.com").description("QA Server"));
        serverList.add(new Server().url("http://prod.iason-reference-data-service.com").description("Production Server"));
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Iason Reference Data Microservice")
                        .description("API Documentation for Iason Reference Data Service")
                        .version("1.0.0")
                        .contact(new Contact().email("vbalaji215@gmail.com").url("http://iason.com")))
                .servers(serverList);
    }
}
