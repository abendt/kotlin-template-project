package demo

import io.kotest.core.spec.style.StringSpec
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class UseLoggerSpec: StringSpec( {
    "can use logger" {
        logger.info { "hello logging" }
    }
})