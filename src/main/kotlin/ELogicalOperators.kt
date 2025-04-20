package com.kishorramani

fun main() {
    var x = 6
    var y = 8
    val areBothEven = x % 2 == 0 && y % 2 == 0
    println("is both number are even: $areBothEven")

    x = 5
    y = 4
    val isOneOfNumberAreEven = x % 2 == 0 || y % 2 == 0
    println("is one of the number is even: $isOneOfNumberAreEven")

    x = 7
    y = 10
    val condition = x % 2 == 0 || y % 2 == 0 && x + y == 17         //&& has higher priority
    val condition1 = x % 2 == 0 || (y % 2 == 0 && x + y == 17)      //The above condition is the same as this condition
    println("Result of condition: $condition")
    println("Result of condition1: $condition1")
}