package it.chicio.modulejackson

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary


@Configuration
class ProductConfiguration {
    @Bean
    fun productRepository(): ProductRepository = ProductRepository()

    @Bean
    @Primary
    fun objectMapper(): ObjectMapper {
        return ObjectMapper().findAndRegisterModules()
    }
}