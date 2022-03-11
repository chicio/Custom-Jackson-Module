package it.chicio.modulejackson

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary


@Configuration
class ProductConfiguration {
    @Bean
    fun productRepository(): ProductRepository = ProductRepository()

    @Primary
    fun objectMapper(): ObjectMapper? {
        val mapper = ObjectMapper()
        return mapper
    }
}