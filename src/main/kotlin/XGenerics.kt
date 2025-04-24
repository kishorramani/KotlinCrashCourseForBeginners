package com.kishorramani

import javax.sql.rowset.Predicate

fun main() {
    val myFavoriteNumber = intArrayOf(1, 2, 3, 4, 5, 6)
    val helloWorld = "Hello world"

    val evenNumber = myFavoriteNumber.filter { it % 2 == 0 }        //myFavoriteNumber is an array of int
    val lettersOnly = helloWorld.filter { it.isLetter() }           //helloWorld is an array of characters
    //here is the filter function is generic

    val list = listOf(1, 2, 2, 3).filter { it % 2 == 0 }      //here, filter is generic
    /*public inline fun <T> Iterable<T>.filter(
        predicate: (T) -> Boolean
    ): List<T>*/

    println(evenNumber)
    println(lettersOnly)

    val stringList = listOf(
        "Hello",
        "World",
        "How are you"
    )
    val intList = listOf(1, 2, 3, 4, 5)

    val filteredString = stringList.myFilter { currentString ->
        currentString.length < 10
    }
    val filteredInt = intList.filter { it < 3 }


    println(filteredString)
    println(filteredInt)

    val result = makeNetworkCall()
    println(result)

    val filteredIntMapToString = intList.map { it.toString() }     //T - Type of class we pass(Int), R - Type we want to map the data
    val filteredIntMapToDouble = intList.map { it.toDouble() }     //T - Type of class we pass(Int), R - Type we want to map the data
    /*public inline fun <T, R> Iterable<T>.map(
        transform: (T) -> R
    ): List<R>*/
    println(filteredIntMapToString)     //output array is a string array
    println(filteredIntMapToDouble)     //output array is a string array
}

fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        if (predicate(element)) {
            result.add(element)
        }
    }
    return result.toList()
}

sealed interface Result<out D, out E> {     //out - use for return type is not decided yet, it will be created based on result return type
    data class Success<D>(val data: D): Result<D, Nothing>      //Nothing is a special class in kotlin
    data class Failure<E>(val error: E): Result<Nothing, E>
}

fun makeNetworkCall(): Result<Int, String> {
    //return Result.Success()
    return Result.Failure("Something went wrong", )
}