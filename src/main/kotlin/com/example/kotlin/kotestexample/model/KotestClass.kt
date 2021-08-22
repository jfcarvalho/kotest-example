package com.example.kotlin.kotestexample.model

class KotestClass {


    var embeddedField : EmbeddedClass? = null
    var field_1 : String? = null
    var field_2 : String? = null
    var field_3 : String? =null
    var field_4 : Integer? = null
    var field_5 : Long? = null
    var field_6 : Double? =null

    constructor(embeddedFieldc : EmbeddedClass?, field_1c : String?, field_2c : String?,
                field_3c : String?, field_4c : Integer?, field_5c : Long?, field_6c : Double? )
    {
        embeddedField = embeddedFieldc
        field_1 = field_1c
        field_2 = field_2c
        field_3 = field_3c
        field_4 = field_4c
        field_5 = field_5c
        field_6 = field_6c

    }

}