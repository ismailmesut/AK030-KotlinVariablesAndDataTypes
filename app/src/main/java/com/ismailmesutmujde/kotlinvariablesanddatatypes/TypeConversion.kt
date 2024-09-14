package com.ismailmesutmujde.kotlinvariablesanddatatypes

fun main() {

    // Example 1
    // from numeric to numeric conversion

    var i : Int = 42
    var d : Double = 42.45
    var f : Float = 42.89f

    var result1 : Int = d.toInt()
    var result2 : Double = i.toDouble()
    var result3 : Int = f.toInt()

    println(result1)
    println(result2)
    println(result3)

    // Example 2
    // from numeric to String conversion
    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)

    // Example 3
    // from String to numeric conversion

    // Method 1
    var text1 = "34t"
    try {
        var x = text1.toInt()
        println(x)
    } catch (e: Exception) {
        println("Tür Dönüşümünde Hata Var")
    }

    // Method 2
    var text2 = "48.56r"
    var y = text2.toDoubleOrNull()

    if(y != null) {
        println("y : $text2")
    } else {
        println("Tür Dönüşümünde Hata Var")
    }

    // Method 3
    var text3 = "67y"
    var z = text3.toIntOrNull()
    z?.let {
        println("z : $z")
    }
}