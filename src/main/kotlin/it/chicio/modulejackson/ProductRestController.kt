package it.chicio.modulejackson

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductRestController(
    private val productRepository: ProductRepository
) {

    @GetMapping("/product/{idProduct}")
    fun getProductFor(@PathVariable idProduct: Long): ResponseEntity<*> =
        productRepository
            .get(idProduct)
            .fold(
                { ResponseEntity.notFound().build() },
                { ResponseEntity.ok(it) }
            )

    @PostMapping("/product/add")
    fun add(@RequestBody product: Product): ResponseEntity<*> =
        productRepository
            .add(product)
            .fold(
                { ResponseEntity.internalServerError().build() },
                { ResponseEntity.ok(it) }
            )
}