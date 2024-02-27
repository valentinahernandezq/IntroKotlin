package com.example.introkotlin

class reto2 {
}

fun main() {

    print("Ingrese el peso: ")
    val peso = readLine()!!.toInt()
    print("Ingrese los meses: ")
    val meses = readLine()!!.toInt()

    val dosisVacuna = ((peso + 10)/(meses * 10))*8
    println("La dosis de la vacuna que se debe aplicar es: $dosisVacuna")

}