package com.kishorramani

fun main() {
    var x = 5
    val y = 9
    println(x + y)
    println(x - y)
    println(x / y)
    println(x * y)
    println(x % y)

    x++     //short cut of x = x + 1
    println(x + y)
    ++x
    println(x + y)
    --x
    println(x + y)

    x = x + 5
    println(x + y)
    x += 5
    println(x + y)

    x + 5       //don't do anything
    println(x + y)

    println(x)
    x *= 4
    println(x + y)
}