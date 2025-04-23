package com.kishorramani

fun main() {
    println(greetMe(Country.INDIA))

    for (country in Country.entries) {
        println(country.code)
    }
}

//Where to use when between Sealed class and Enum class
//Sealed class
//You need a closed hierarchy of classes.
//Each subtype might have different properties or behaviors. like shape - circle, rectangle, pentagon
//You're using when expressions exhaustively — Kotlin enforces this for sealed types.
//You need more flexibility and control over subclassing.

//Enum class
//You have a fixed set of constants.
//All the enum values are instances of the same type.
//You don't need to carry different data with each value (or just a small set of common properties).
//You want to leverage built-in features like .name, .ordinal, and Enum.values().
//enum class Direction { NORTH, SOUTH, EAST, WEST }
enum class Country1 {
    INDIA, USA, GERMANY     //it's constant
}

//it's a constant, limited set of options, All data are belong to all countries are also the constant, so it's enum class
enum class Country(val code: String) {
    INDIA("IN"),
    USA("US"),
    GERMANY("DE"),
    FRANCE("FR")
}

fun greetMe(country: Country): String {
    return when (country) {
        Country.INDIA -> "Namaste!"
        Country.USA -> "Hello!"
        Country.GERMANY -> "Guten Tag!"
        Country.FRANCE -> "Bonjour!"
    }
}