package io.project.chagchagchag.foobarpay.banking.service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// http://localhost:8080/swagger-ui/index.html
@OpenAPIDefinition(
    info = @Info(
        title = "foobar-pay / banking",
        description = "foobar-pay 의 뱅킹시스템",
        version = "v1"
    )
)
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
  @Bean
  public GroupedOpenApi openApi(){
    String [] paths = {"/v1/**"};

    return GroupedOpenApi.builder()
        .group("푸바 뱅킹 V1")
        .pathsToMatch(paths)
        .build();
  }
}
