package com.kishorramani

fun main() {
    //println("Please enter some input: ")        //it's nullable
    //val input = readln().toIntOrNull()
    //println("Your entered input: $input")

    //println("Please enter some input1: ")        //it's nullable
    //val input1 = readln().toIntOrNull()
    //val isEven1 = input1!! % 2 == 0        //Operator call is prohibited on a nullable receiver of type 'Int?'. Use '?.'-qualified call instead.
    ////!! => java.lang.NullPointerException - if it's string value
    //println("Your entered input1 is even?: $isEven1")

    //println("Please enter some input2: ")        //it's nullable
    //val input2 = readln().toIntOrNull() ?: 0        //if input is string then it'd take 0
    //val isEven2 = input2 % 2 == 0
    //println("Your entered input2 is even?: $isEven2")

    println("Please enter some input3: ")        //it's nullable
    //val input3 = readln().toIntOrNull()?.inc()      //It's increase
    //val input3 = readln().toIntOrNull()?.rem(2)
    //val input3 = readln().toIntOrNull()?.rem(2) == 0      //null == 0
    val input3 = readln().toIntOrNull()?.rem(2)?.equals(0)      //when we use ?. at the end (2)?. => then it's give null
    println("Your entered input3: $input3")
}