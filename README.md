# Custom module Jackson

[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/chicio/Custom-Jackson-Module/main/LICENSE.md)

An example Kotlin project created for my blog post ["A custom module for Jackson object mapper using Java Service 
Provider"](https://www.fabrizioduroni.it/2022/03/02/custom-jackson-module-deserlializer-serializer-object-mapper-java-spi/).

### Description

This repository contains an example of a custom module for Jackson that levearage the power of [Java SPI](https://en.wikipedia.org/wiki/Service_provider_interface), useful in 
case of custom serialization/deserialization. Below an article quote:

> ...During the definition of a new microservice we had to customize the object mapper used by Axon,
defined in one maven module (that will probably be integrated in our [app-framework framework](https://technology.lastminute.com/frontend-backend-languages-frameworks/)
if we decide to stick with it) from one of our new app specific module *without creating any kind of
coupling/dependencies*. This is how me and [Alex Stabile](https://www.linkedin.com/in/alex-stabile-a9316b94/)
discovered the power of [Java Service Provider interface](https://www.baeldung.com/java-spi), used by [Jackson
Object Mapper](https://www.baeldung.com/jackson-object-mapper-tutorial) to register external custom [Modules](https://fasterxml.github.io/jackson-databind/javadoc/2.7/com/fasterxml/jackson/databind/Module.html) in order
to apply application specific serialization/deserialization procedures...

Click [here](https://www.fabrizioduroni.it/2022/03/02/custom-jackson-module-deserlializer-serializer-object-mapper-java-spi/) to read the post.