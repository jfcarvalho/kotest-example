package com.example.kotlin.kotestexample.service

import com.example.kotlin.kotestexample.model.EmbeddedClass
import com.example.kotlin.kotestexample.model.KotestClass
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class KotestService {

    fun func1() {
        try{
            System.out.println("Try Man")
        }catch(e : Exception) {
            System.out.println("Catch Man")
        }

    }

    fun func2() {
        try {
            val a = KotestClass(
                    EmbeddedClass(
                        Integer(1),
                        Integer(1),
                        Integer(1)
                    ),
                "1",
                "2",
                "3",
                Integer(1),
                1L,
                1.0
            )
        }catch(e: Exception) {
            System.out.println("Catch man")
        }
    }

    fun func3() {

    }

    fun func4() {

    }
}