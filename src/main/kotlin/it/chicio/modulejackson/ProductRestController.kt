package it.chicio.modulejackson

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductRestController(
    private val productRepository: ProductRepository
) {

    @GetMapping("/product/{idProduct}")
    fun getProductDetail(@PathVariable idProduct: Long): ResponseEntity<*> =
        productRepository
            .get(idProduct)
            .fold(
                { ResponseEntity.notFound().build() },
                { ResponseEntity.ok(it) }
            )
}