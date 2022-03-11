package it.chicio.modulejackson

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import org.javamoney.moneta.Money
import java.io.IOException

open class MoneySerializer : StdSerializer<Money>(Money::class.java) {
    @Throws(IOException::class)
    override fun serialize(money: Money, jsonGenerator: JsonGenerator, serializerProvider: SerializerProvider) {
        jsonGenerator.writeStartObject()
        jsonGenerator.writeStringField("amount", money.numberStripped.toPlainString())
        jsonGenerator.writeStringField("currency", money.currency.toString())
        jsonGenerator.writeEndObject()
    }
}
