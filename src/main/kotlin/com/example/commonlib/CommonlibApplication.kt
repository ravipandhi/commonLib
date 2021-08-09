package com.example.commonlib

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommonlibApplication

fun main(args: Array<String>) {
    runApplication<CommonlibApplication>(*args)
}
