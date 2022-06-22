package com.backendlearning.kotlin.springboot.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping() // in order to get here and call the next function, the URL must be api/hello/springboot:
    fun helloWorld(): String {
        return "hello"
    }

}


