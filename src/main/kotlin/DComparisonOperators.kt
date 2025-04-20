package com.kishorramani

fun main() {
    val x = 5
    val y = 9
    println(x == y)

    println(x > y)
    println(x < y)

    println(x <= y)
    println(x >= y)

    val areNumberTheSame = x == y
    println(areNumberTheSame)

    println(x % 5 == 0)

    println("Is x is an even number?: ${x % 2 == 0}")

    println("is x and y are not same: " + (x != y))
}