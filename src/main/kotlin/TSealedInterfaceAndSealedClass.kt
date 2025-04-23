package com.kishorramani

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect7 = Rectangle7(5f, 7f)
    val circle7 = Circle7(15f)

    printShapes7(rect7, circle7)
}

//If we required the constructor for every child class, then we have to create the sealed class - by which every child class can implement that constructor
sealed interface Shape7 {
    val area: Float
    val circumference: Float
}

data class Rectangle7(
    val width: Float,
    val height: Float
) : Shape7 {
    val diagonal = sqrt(width * width + height * height)

    override val area: Float
        get() = width * height

    override val circumference = 2 * width + 2 * height
}

data class Circle7(val radius: Float) : Shape7 {
    override val area = radius * radius * PI.toFloat()

    override val circumference: Float
        get() = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}

//here we don't have to define the else branch
fun printShapes7(vararg shapes: Shape7) {
    for (shape in shapes) {
        val output = when (shape) {
            is Circle7 -> "It's circle"
            is Rectangle7 -> "It's rectangle"
        }
        println(output)
    }
}