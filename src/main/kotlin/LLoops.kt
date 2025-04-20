package com.kishorramani

fun main() {
    println("How many numbers you want to sum:")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    //while loops
    var sum = 0
    var i = 0
    while (i < amountOfNumbers) {
        println("Please enter number: #${i + 1}")
        //val number = readln().toIntOrNull() ?: 0
        //val number = readln().toIntOrNull() ?: break     //If input is in-correct, then it's break the complete loop.
        val number = readln().toIntOrNull() ?: continue     //If input is in-correct, then it's continued to loop.
        sum += number
        i++
    }

    println("The total sum is: $sum")

    println("==========create array using intArrayOf==========")

    println("Please enter number to create dynamic array of numbers:")
    val amountOfNumbers1 = readln().toIntOrNull() ?: 0
    var numberArray = intArrayOf()
    var j = 0
    while (j < amountOfNumbers1) {
        println("Please enter number: #${j + 1}")
        val number = readln().toIntOrNull() ?: continue     //If input is in-correct, then it's continued to loop.
        numberArray += number       //It's creating an entirely new array
        j++
    }
    println("The final numberArray array is: ${numberArray.contentToString()}")

    println("==========mutableListOf==========")
    println("Please enter number to create dynamic array of numbers using mutableListOf:")
    val amountOfNumbers2 = readln().toIntOrNull() ?: 0
    val numberArray2 = mutableListOf<Int>()
    var k = 0
    while (k < amountOfNumbers2) {
        println("Please enter number: #${k + 1}")
        val number = readln().toIntOrNull() ?: continue     //If input is in-correct, then it's continued to loop.
        numberArray2.add(number)        //add is used to add an element in the list
        k++
    }
    println("The final numberArray2 array is: $numberArray2")

    println("==========For loop==========")
    println("Please enter number to create dynamic array of numbers using mutableListOf and for loop:")
    val amountOfNumbers3 = readln().toIntOrNull() ?: 0
    val numberArray3 = mutableListOf<Int>()
    //for (l in 0..amountOfNumbers3)      //If it's start with 0 then it's include the one more element
    //for (l in 1..amountOfNumbers3)      //It's good
    //it's good, it's excluding the last element
    for (i in 0 until amountOfNumbers3) {
        println("Please enter number: #${i + 1}")
        val number = readln().toIntOrNull() ?: continue     //If input is in-correct, then it's continued to loop.
        numberArray3.add(number)        //add is used to add an element in the list
    }
    println("The final numberArray3 array is: $numberArray2")

    println("Print each number in numberArray3")
    for (number in numberArray3) {
        println(number)
    }

    println("==========For loop - string - list of characters ==========")
    println("Enter the string")
    val input = readln()
    for (character in input) {
        println(character)
    }

    println("Reverse")
    val finalReverseString = buildString {
        for (i in input.lastIndex downTo 0) {
            append(input[i])
        }
    }

    println(finalReverseString)
}