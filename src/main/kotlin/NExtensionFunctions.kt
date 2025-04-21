package com.kishorramani

fun main() {
    println("Enter the string")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()        //toIntOrNull() - It's an extension function.

    val reversed = input.stringReversed()
    println(reversed)
}

fun String.stringReversed(): String {
    return buildString {
        for (i in this@stringReversed.lastIndex downTo 0) {
            append(this@stringReversed[i])        //this@reversed used because there are multiple "this" used. (reversed and buildString)
        }
    }
}

fun String.reversed1(           //if it's an extension function, we can still add parameters, use according to usecase
    stringToReverse: String = "Hello world",
    number: Int
): String {
    return buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }
}