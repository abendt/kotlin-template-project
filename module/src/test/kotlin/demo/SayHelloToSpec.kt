package demo

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SayHelloToSpec : StringSpec({
    "can say hello" {
        sayHelloTo("Kotlin") shouldBe "Hello Kotlin"
    }
})