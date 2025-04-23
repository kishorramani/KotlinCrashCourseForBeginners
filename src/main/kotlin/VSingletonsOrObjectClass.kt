package com.kishorramani

import java.sql.Date
import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    println(FixSizeSquare.area)
}

//object (Singleton Object)
//Creates a singleton instance.
//Can have properties, functions, init blocks.
//Does not support toString(), equals(), hashCode() overrides automatically.
//Used when you just want a single instance of a class.
object FixSizeSquare1 : Shape8 {
    override val area: Float = 25f
    override val circumference: Float = 40f
}

//Also a singleton, but behaves more like a data class.
//Automatically generates: toString(), equals(), hashCode()
//Cannot have a constructor.
//Useful when you need a singleton with value semantics, like in sealed hierarchies.
//Object class or singleton class don't have a constructor
data object FixSizeSquare : Shape8 {
    override val area: Float = 25f
    override val circumference: Float = 40f
}

//Group of utility functionality
object DateUtils {
    fun formatDate(date: Date): String {
        return ""
    }
}

sealed interface Shape8 {
    val area: Float
    val circumference: Float
}

fun printShapes7(vararg shapes: Shape8) {
    for (shape in shapes) {
        val output = when (shape) {
            is Circle8 -> "It's circle"
            is Rectangle8 -> "It's rectangle"
            is FixSizeSquare -> "It's fix size square data object"
            is FixSizeSquare1 -> "It's fix size square object"
        }
        println(output)
    }
}

data class Rectangle8(
    val width: Float,
    val height: Float
) : Shape8 {
    val diagonal = sqrt(width * width + height * height)

    override val area: Float get() = width * height

    override val circumference = 2 * width + 2 * height
}

data class Circle8(val radius: Float) : Shape8 {
    override val area = radius * radius * PI.toFloat()

    override val circumference: Float
        get() = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}