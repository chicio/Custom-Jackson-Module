package it.chicio.modulejackson

import arrow.core.Option
import arrow.core.toOption
import org.javamoney.moneta.Money
import java.math.BigDecimal

class ProductRepository {
    private val products = listOf(
        Product(
            1,
            "A product",
            Money.of(BigDecimal("100.00"), "EUR")
        ),
        Product(
            2,
            "Another product",
            Money.of(BigDecimal("150.00"), "EUR")
        ),
        Product(
            3,
            "Yet another product",
            Money.of(BigDecimal("120.50"), "EUR")
        )
    )

    fun get(idProduct: Long): Option<Product> =
        products.find { it.idProduct == idProduct }.toOption()
}