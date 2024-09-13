package com.ismailmesutmujde.kotlinvariablesanddatatypes

fun main() {

    // Example 1
    var studentName = "ismail"
    var studentAge = 23
    var studentHeight = 1.98
    var studenNameChar = 'i'

    println(studentName)
    println(studentAge)
    println(studentHeight)
    println(studenNameChar)

    // Example 2

    var product_id : Int = 3416
    var product_name : String = "Kol saati"
    var product_quantity : Int = 100
    var product_price : Double = 109.99
    var product_supplier : String = "rolex"

    println("Product id       : $product_id")
    println("Product name     : $product_name")
    println("Product quantity : $product_quantity")
    println("Product price    : $product_price")
    println("Product supplier : $product_supplier")

    // Example 3
    println("$product_supplier marka $product_name $product_price fiyatla satılmaktadır. Stokta $product_quantity adet kalmıştır.")

    // Example 4
    var a = 10
    var b = 20
    println("$a ve $b nin toplamı : ${a+b}")
}