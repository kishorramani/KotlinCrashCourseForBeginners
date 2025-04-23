package com.kishorramani

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect4 = Rectangle4(5f, 7f)
    val circle4 = Circle4(15f)
    val sumOfAreas = sumAreas(rect4, circle4)
    println(sumOfAreas)

    printShapes(rect4, circle4)
}

interface Shape4 {
    val area: Float
    val circumference: Float

    //fun helloWorld(counter: Int)        //if we write this, we need to implement this method
}

data class Rectangle4(
    val width: Float,
    val height: Float
) : Shape4 {
    val diagonal = sqrt(width * width + height * height)

    override val area: Float
        get() = width * height

    override val circumference = 2 * width + 2 * height
    /*override val circumference: Float
        get() = 2 * width + 2 * height*/
}

data class Circle4(val radius: Float) : Shape4 {
    override val area = radius * radius * PI.toFloat()

    override val circumference: Float
        get() = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}

fun sumAreas(vararg shapes: Shape4): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

fun printShapes(vararg shapes: Shape4) {
    for (shape in shapes) {
        //if (shape is Circle4) { }     This way, also works
        when (shape) {       //type check with when expression
            is Circle4 -> println("It's circle")
            is Rectangle4 -> println("It's Rectangle")
        }

        val output = when (shape) {
            is Circle4 -> "It's circle"
            is Rectangle4 -> "It's rectangle"
            else -> null        //We must have this else branch, otherwise it's giving an error. If we don't need else branch, then we have to use sealed class
        }
        println(output)
    }
}