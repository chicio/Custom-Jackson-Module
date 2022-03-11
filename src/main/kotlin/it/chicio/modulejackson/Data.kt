package it.chicio.modulejackson

import org.javamoney.moneta.Money

data class Product(
    val idProduct: Long,
    val description: String,
    val amount: Money
)