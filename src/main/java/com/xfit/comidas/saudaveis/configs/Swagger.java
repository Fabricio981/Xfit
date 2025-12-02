package com.xfit.comidas.saudaveis.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "X-Fit",
        version = "1.0",
        description = "Fabrício Alves"
    )
)
public class Swagger {
    
}