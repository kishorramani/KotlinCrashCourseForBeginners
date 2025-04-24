package com.kishorramani

import kotlin.math.sqrt

fun main() {
    val rect = Rectangle9(
        width = 15f,
        height = 10f
    )

    rect.diagonal       //It's accessible because it's public
    //rect.totalHeight        //it's not public

    rect.area

    //rect.counter        //This is not accessible outside the child class because it's protected
    rect.counter1       //It's public
}

data class Rectangle9(
    val width: Float,
    val height: Float
) : Shape9, Shape10() {
    val diagonal = sqrt(width * width + height * height)

    private val totalHeight = height * 2

    override val area: Float get() = width * height

    override val circumference = 2 * width + 2 * height

    override val counter: Int = 10
    override val counter1: Int get() = 15
    override val counter2: Int get() = 25
}

sealed interface Shape9 {
    val area: Float
    val circumference: Float
}

abstract class Shape10 {
    protected abstract val counter: Int     //This is accessible in the child class but's not outside the class
    abstract val counter1: Int
    internal abstract val counter2: Int     //Internal means it's accessible inside the module, not outside the module, it's useful when we can provide our module as a lib rary
}