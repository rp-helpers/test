package com.pryjda.smalltest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmallTestApplication

fun main(args: Array<String>) {
    runApplication<SmallTestApplication>(*args)
}
