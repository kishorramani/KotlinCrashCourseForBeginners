package com.kishorramani

fun main() {
    println("Please enter a input: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val output = when {
            inputAsInteger % 2 == 0 -> "The number is even"
            inputAsInteger <= 10 -> "The number is odd and less than or equal to 10"
            else -> { "The number is odd and greater than 10" }
        }
        println(output)
    } else {
        println("Invalid number, Please enter a valid number")
    }

    val output1 = when(inputAsInteger) {
        null -> "Enter a valid number"
        3 -> "The number is 3"
        5 -> "The number is 5"
        in 10..20 -> "The number is between 10 to 20"
        else -> "All condition is not matched: The number is $inputAsInteger"
    }
    println(output1)

    when(inputAsInteger) {      //Here, we don't assign to variable
        null -> println("Enter a valid number")
        3 -> println("The number is 3")
        5 -> println("The number is 5")
        in 10..20 -> println("The number is between 10 to 20")
        else -> println("All condition is not matched: The number is $inputAsInteger")
    }
}