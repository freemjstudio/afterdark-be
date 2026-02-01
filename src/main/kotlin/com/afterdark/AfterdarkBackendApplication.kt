package com.afterdark

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AfterdarkBackendApplication

fun main(args: Array<String>) {
	runApplication<AfterdarkBackendApplication>(*args)
}
