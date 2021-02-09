package org.postmost.pmdiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PmDiscoveryApplication

fun main(args: Array<String>) {
    runApplication<PmDiscoveryApplication>(*args)
}
