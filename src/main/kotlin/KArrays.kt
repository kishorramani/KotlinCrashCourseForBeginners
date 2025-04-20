package com.kishorramani

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val floatNumbers = floatArrayOf(1f, 2f, 3f, 4f, 5f, 6f, 7f)
    val doubleNumbers = floatArrayOf(1f, 2f, 3f, 4f, 5f, 6f, 7f)
    val mixArray = arrayOf(1f, 2, "Kishor", 4.05f)

    println(numbers[0])
    println(numbers[1])
    //println(numbers[7])     //java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
    println(numbers.getOrNull(7))

    println("Enter the position of the numbers: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    //if (inputAsInteger != null {
    //if (inputAsInteger != null && inputAsInteger < numbers.size) {      //this condition is break for -1 input
    //if (inputAsInteger != null && inputAsInteger in 0..numbers.size) {      //This is not work for last index
    if (inputAsInteger != null && inputAsInteger in 0..numbers.lastIndex) {
        println("Your number is: ${numbers[inputAsInteger]}")
    } else {
        println("The number is not available at this position")
    }

    val numbers2 = intArrayOf(1, 2, 3, 4, 5, 6, 7) + 8      //+ operator adds the new value 8 to the numbers1 - it's the same as intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("${numbers2[7]}")

    numbers2[2] = 69       //update the value of index 2
    println("${numbers2[2]}")
}