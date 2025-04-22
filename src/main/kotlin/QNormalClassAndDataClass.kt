package com.kishorramani

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(
        width = 10f,
        height = 5f
    )

    val rect2 = Rectangle(
        width = 10f,
        height = 5f
    )

    println(rect1.width)
    println(rect1.height)
    println("Diagonal: ${rect1.diagonal}")
    println("area of rect1: ${rect1.area}")
    println("area of rect2: ${rect2.area}")

    println("max: ${maxArea(rect1, rect2)}")

    println("is rect1 and rect2 are same? - ${rect1 == rect2}")         //class comparison - class are not compared based on your content

    val rect3 = rect1
    println("rect3 and rect1 are same? - ${rect3 == rect1}")

    println("print normal class: $rect1")      //print normal class

    println("==============data class================")
    val rect4 = Rectangle1(
        width = 10f,
        height = 5f
    )

    val rect5 = Rectangle1(
        width = 10f,
        height = 5f
    )

    println("is rect4 and rect5 are same? - ${rect4 == rect5}")         //data class comparison - class are compared based on your content

    println("print data class: $rect4")      //print data class - it's like human-readable data

    val rect6 = rect5.copy(
        width = 7f
    )
    println("rect6: $rect6")

    println("==============circle================")
    val circle = Circle(radius = 7f)
    println("diameter:" + circle.diameter)
    println("Area: " + circle.area)
}

class Rectangle(val width: Float, val height: Float) {
    val diagonal = sqrt(width * width + height * height)
    val area = width * height
}

data class Rectangle1(val width: Float, val height: Float) {
    val diagonal = sqrt(width * width + height * height)
    val area = width * height
}

fun maxArea(reac1: Rectangle, reac2: Rectangle): Float {        //class as argument
    val area1 = reac1.area
    val area2 = reac2.area

    return maxOf(area1, area2)
}

data class Circle(val radius: Float) {
    val area =  radius * radius * PI

    val diameter = 2 * radius
}