package com.kishorramani

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect4 = Rectangle4(5f, 7f)
    val circle4 = Circle4(15f)
    val sumOfAreas = sumAreas(rect4, circle4)
    println(sumOfAreas)
}

interface Shape4 {
    val area: Float
    val circumference: Float
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

fun sumAreas(vararg shape4s: Shape4): Double {
    return shape4s.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}