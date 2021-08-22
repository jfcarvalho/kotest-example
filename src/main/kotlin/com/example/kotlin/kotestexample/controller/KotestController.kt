package com.example.kotlin.kotestexample.controller

import com.example.kotlin.kotestexample.service.KotestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class KotestController {
    @Autowired
    lateinit var kotestService: KotestService

    @GetMapping
    fun kotestExample()  {
        kotestService.func1()
        kotestService.func2()
    }

    @PostMapping
    fun kotestExample2()  {

    }

}