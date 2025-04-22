package com.kishorramani

import javax.sql.rowset.Predicate

fun main() {
    println("Enter a string:")
    val input = readln()

    val letterOnly = input.filter {
        it.isLetter()
    }

    println(letterOnly)

    println("=================")
    val favoriteNumber = intArrayOf(1, 2, 3, 4, 5, 6, 78, 98, 47, 45)
    val evenNumber = favoriteNumber.filter {
        it % 2 == 0     //i * i
    }
    println("Even number is: $evenNumber")

    println("========Custom lambada function=========")
    val letterOutput = input.myFilter {
        it.isLetter()
    }
    println("Letter: $letterOutput")

    val numberOutput = input.myFilter {
        it.isDigit()
    }
    println("Numbers: $numberOutput")

    println("=================")

    val numberOutput1 = input.myFilter1 {
        this.isDigit()
    }
    println("Numbers1: $numberOutput1")
}

fun String.myFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@myFilter) {
            if (predicate(char)) {
                append(char)
            }
        }
    }
}

fun String.myFilter1(predicate: Char.() -> Boolean): String {       //extend char
    return buildString {
        for (char in this@myFilter1) {
            if (char.predicate()) {
                append(char)
            }
        }
    }
}