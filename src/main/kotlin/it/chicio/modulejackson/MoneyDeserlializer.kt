package it.chicio.modulejackson

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import org.javamoney.moneta.Money
import java.math.BigDecimal

open class MoneyDeserializer : StdDeserializer<Money>(Money::class.java) {
    override fun deserialize(jsonParser: JsonParser, obj: DeserializationContext): Money {
        val node: JsonNode = jsonParser.codec.readTree(jsonParser)
        val amount = BigDecimal(node.get("value").asText())
        val currency: String = node.get("currency").asText()

        return Money.of(amount, currency)
    }
}
