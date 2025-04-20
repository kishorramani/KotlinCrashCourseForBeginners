package com.kishorramani

fun main() {
    println("Please enter a input: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val isEven = inputAsInteger % 2 == 0
        if (isEven) {
            println("Entered number is Even")
        } else {
            println("Entered number is Odd")
        }

        if (!isEven) {      //please write positive if condition - it's help to understand better
            println("Entered number is Odd")
        } else {
            println("Entered number is Even")
        }

        val output = if (inputAsInteger % 2 == 0) {     //in this case, else is required
            "The number is even"
        } else {
            "The number is odd"
        }
        println(output)

        val output1 = if (inputAsInteger % 2 == 0) {     //in this case, else is required
            "The number is even"
        } else if (inputAsInteger < 11){
            "The number is odd and less then 11"
        } else {
            "The number is odd and bigger or equal than 11"
        }
        println(output1)
    } else {
        println("Invalid number, Please enter a valid number")
    }
}