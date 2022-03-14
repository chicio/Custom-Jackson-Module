package it.chicio.modulejackson

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
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
        return ObjectMapper()
            .findAndRegisterModules()
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
    }
}