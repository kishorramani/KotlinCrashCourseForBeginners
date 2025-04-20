package com.kishorramani

fun main() {
    println("Please enter a input: ")
    val input = readln()
    //throw Exception("Wtf, is this input")     //It's help you to throw any exception
    val inputAsInteger = try {
        input.toInt()
    //} catch (e: NumberFormatException) {
    } catch (e: Exception) {
        0
    } finally {

    }

    when(inputAsInteger) {      //Here, we don't assign to variable
        null -> println("Enter a valid number")
        3 -> println("The number is 3")
        5 -> println("The number is 5")
        in 10..20 -> println("The number is between 10 to 20")
        else -> println("All condition is not matched: The number is $inputAsInteger")
    }
}