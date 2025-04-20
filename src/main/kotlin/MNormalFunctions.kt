package com.kishorramani

fun main() {
    println("Enter the string")
    val input = readln()

    println("Reverse the input")
    reverseString0(input)       //This print out from the function

    val reversedInPut = reverseString(input)        //This function return the value
    println(reversedInPut)
}

fun reverseString0(stringToReverse: String) {
    val reversedString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }
    println(reversedString)
}

fun reverseString(stringToReverse: String): String {
    return buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }
}