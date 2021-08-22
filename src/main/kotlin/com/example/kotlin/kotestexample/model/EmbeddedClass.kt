package com.example.kotlin.kotestexample.model

import java.util.*

class EmbeddedClass {
    var embbeded_field1 : Integer? = null
    var embbeded_field2 : Integer? = null
    var embbeded_field3 : Integer? = null

    constructor(embbededc_field1: Integer?, embbededc_field2: Integer?, embbededc_field3: Integer?) {
        embbeded_field1 = embbededc_field1
        embbeded_field2 = embbededc_field2
        embbeded_field3 = embbededc_field3
    }
}