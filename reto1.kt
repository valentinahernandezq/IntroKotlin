package com.example.introkotlin

class reto1 {
}

fun main() {

    print("Ingrese los grados fahrenheit: ")
    val fahrenheit = readLine()!!.toInt()

    val celsius = (fahrenheit - 32) / 1.8

    println("La temperatura en grados Celsius es: $celsius")
}
