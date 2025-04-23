package com.kishorramani

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect5 = Rectangle5(5f, 7f)
    val circle5 = Circle5(15f)
    val sumOfAreas = sumAreas5(rect5, circle5)
    println(sumOfAreas)

    //val shape5 = Shape5()       //We can't create an instance of abstract class directly, we can create an instance of chile class

    //The main difference in between interface and abstract class is
    // - Abstract class can have normal functionality as well and internal state (value that change over time)
    // - It's means that every single subclass of shape will also get this behavior, will also inherit that
    rect5.inc()
    circle5.inc()
    val rectangleCounter = rect5.counter
    val circleCounter = circle5.counter
    println("rectangleCounter: $rectangleCounter")  //each has its own counter
    println("circleCounter: $circleCounter")        //each has its own counter, both print 1

    println("==================Open=================")
    val rect6 = Rectangle6(5f, 7f)
    val circle6 = Circle6(15f)
    rect6.inc()
    circle6.inc()

    val sumOfAreas1 = sumAreas6(rect6, circle6)
    val rect6Area = rect6.area
    val circle6Area = circle6.area      //it's not override in circle6 so it's take it's parent class (open class)'s area value
    println("Rect area: $rect6Area")
    println("Circle area: $circle6Area")
    println(sumOfAreas1)

    val rectangleCounter1 = rect6.counter
    val circleCounter1 = circle6.counter
    println("rectangleCounter1: $rectangleCounter1")  //each has its own counter
    println("circleCounter1: $circleCounter1")        //each has its own counter, both print 1

    val shape6 = Shape6()       //here, we can create the shape's class object
}

//abstract class is real class blueprint
//If any other class want to be the shape then you need to implement this, and it's work by override
//We can't create an instance of abstract class directly, we can create an instance of chile class

//The main difference in between interface and abstract class is
// - Abstract class can have normal functionality as well and internal state
// - It's means that every single subclass of shape will also get this behavior, will also inherit that

//Sometimes, when we need a class to have such an internal state (counter variable in our case) and be inheritable, then abstract class useful

//normal class and data class are not inheritable.
//If we want normal class to be inheritable without using abstract behavior, that we can't create an instance of this shape class itself, we need to make the clas an "open" class
abstract class Shape5 {
    abstract val area: Float
    abstract val circumference: Float

    var counter = 0     //state

    //we provide default implementation of the interface, but we cannot have a variable in the interface directly and that we can change directly
    fun inc() {
        counter++
    }
}

data class Rectangle5(
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

data class Circle5(
    val radius: Float
) : Shape5() {
    override val area = radius * radius * PI.toFloat()

    override val circumference: Float
        get() = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}

fun sumAreas5(vararg shape4s: Shape5): Double {
    return shape4s.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

//================================
open class Shape6 {
    open val area: Float = 0f       //here we need to provide the default value - why? - it's because if we inherit this open class, then it's not necessary to override this behavior
    open val circumference: Float = 0f

    var counter = 0     //state

    //we provide default implementation of the interface, but we cannot have a variable in the interface directly and that we can change directly
    fun inc() {
        counter++
    }
}

data class Rectangle6(
    val width: Float,
    val height: Float
) : Shape6() {
    val diagonal = sqrt(width * width + height * height)

    override val area: Float
        get() = width * height

    override val circumference = 2 * width + 2 * height
    /*override val circumference: Float
        get() = 2 * width + 2 * height*/
}

data class Circle6(
    val radius: Float
) : Shape6() {
    //we inherit this open class, then it's not necessary to override shape6's behavior
    //override val area = radius * radius * PI.toFloat()

    //override val circumference: Float get() = 2 * radius * PI.toFloat()

    val diameter = 2 * radius
}

fun sumAreas6(vararg shapes: Shape6): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}