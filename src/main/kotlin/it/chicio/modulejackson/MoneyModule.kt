package it.chicio.modulejackson

import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.module.SimpleSerializers
import org.javamoney.moneta.Money

class MoneyModule: SimpleModule() {
    override fun getModuleName(): String = this.javaClass.simpleName

    override fun setupModule(context: SetupContext) {
        val serializers = SimpleSerializers()
        serializers.addSerializer(Money::class.java, MoneySerializer())
        context.addSerializers(serializers)
    }
}
