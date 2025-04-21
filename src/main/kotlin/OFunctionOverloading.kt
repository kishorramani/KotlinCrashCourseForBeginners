package com.kishorramani

fun main() {
    println("Enter the string")
    val input = readln().toInt()

    val reversed = input.intReversed()
    println(reversed)
}

fun String.stringReversed1(): String {
    return buildString {
        for (i in this@stringReversed1.lastIndex downTo 0) {
            append(this@stringReversed1[i])        //this@reversed used because there are multiple "this" used. (reversed and buildString)
        }
    }
}

fun Int.intReversed(): Int {
    return this.toString().reversed().toInt()       //here reversed function is from kotlin libraries
}


//Check below two functions that are with different parameter
fun reversed(
    string: String
): String {
    return buildString {
        for (i in string.lastIndex downTo 0) {
            append(string[i])        //this@reversed used because there are multiple "this" used. (reversed and buildString)
        }
    }
}

fun reversed(
    number: Int
): Int {
    return number.toString().reversed().toInt()       //here reversed function is from kotlin libraries
}

