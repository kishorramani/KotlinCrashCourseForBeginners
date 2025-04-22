package com.kishorramani

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {

}

abstract class Shape5 {
    abstract val area: Float
    abstract val circumference: Float
}

data class Rectangle4(
    val width: Float,
    val height: Float
) : Shape5() {
    val diagonal = sqrt(width * width + height * height)

    override val area: Float
        get() = width * height

    override val circumference = 2 * width + 2 * height
    /*override val circumference: Float
        get() = 2 * width + 2 * height*/
}

data class Circle4(val radius: Float) : Shape5() {
    override val area = radius * radius * PI.toFloat()

    override val circumference: Float
        get() = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}