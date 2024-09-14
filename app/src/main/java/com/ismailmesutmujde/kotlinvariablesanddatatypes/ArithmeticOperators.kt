package com.ismailmesutmujde.kotlinvariablesanddatatypes

fun main() {

    // Example 1
    // Circle Area
    val pi = 3.14
    var radius = 2.0

    var circleArea = pi * radius * radius
    println("Circle Area : $circleArea")

    // Example 2
    // Newton's Second Law : F = m * a
    var m = 12.5
    var a = 10.0
    var F = m * a
    println("F : $F")

    // Example 3
    // deltaX = ((v+v0)/2)*t
    var v = 12.7
    var v0 = 23.56
    var t = 3.5

    var deltaX = ((v+v0)/2)*t
    println("deltaX : $deltaX")

    // Example 4
    // deltaX = v0*t + (a*t*t)/2
    deltaX = (v0*t) + (a*t*t)/2
    println("deltaX : $deltaX")

    // Example 5
    // Kısaltma
    var y = 10
    y = y + 2
    println(y)
    y += 2
    println(y)

    y -= 3
    println(y)

    y *= 4
    println(y)

    y /= 11
    println(y)
}