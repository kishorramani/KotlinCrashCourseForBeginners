package com.kishorramani

fun main() {
    println("Please enter some input: ")
    val input = readln()
    println("You've entered $input")

    println("Please enter some input1: ")
    val input1 = readln().toInt()       //if we enter string, then we will get NumberFormatException.forInputString
    val isEven = input1 % 2 == 0
    println("Your entered input1 is even?: $isEven")
}