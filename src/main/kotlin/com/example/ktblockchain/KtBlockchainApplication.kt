package com.example.ktblockchain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class KtBlockchainApplication {
	fun main(args: Array<String>) {
		runApplication<KtBlockchainApplication>(*args)
	}

	@Bean
	fun restTemplate(builder: RestTemplateBuilder): RestTemplate
		= builder.build()
}

