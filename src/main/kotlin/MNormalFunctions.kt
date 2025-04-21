package com.kishorramani

fun main() {
    println("Enter the string")
    val input = readln()

    println("Reverse the input")
    reverseString0(input)       //This print out from the function

    val reversed = reverseString(input)        //This function return the value
    println(reversed)

    println(reverseString(reversed))

    println("=============Palindrome=============")
    if (input == reversed) {
        println("It's a Palindrome!")
    } else {
        println("It's not palindrome")
    }

    println("=============Default parameter=============")
    val defaultReversed = reverseString()
    println(defaultReversed)

    println("=============Named parameter=============")
    val reversed1 = reverseString(stringToReverse = input)      //named parameter, if there are multiple parameters
}

fun reverseString0(stringToReverse: String) {
    val reversedString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }
    println(reversedString)
}

fun reverseString(
    stringToReverse: String = "Hello world"
): String {
    return buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }
}