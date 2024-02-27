package com.example.introkotlin

class piedraPapelTijeraDoWhile {
}
fun main() {

    print("¿Cuantas vidas quieres?")
    var vida = readLine()!!.toInt()

    do {
        print("Escribe 1 para piedra, 2 para tijera y 3 para papel: ")
        var jugada = readLine()!!.toInt()

        val rand = ((1..3).random())

        if (jugada == rand) {
            println("Empate, juega de nuevo :) ")
        } else if ((jugada == 1 && rand == 2) || (jugada == 2 && rand == 3) || (jugada == 3 && rand == 1)) {
            println("Ganaste!! ")
        } else {
            println("Perdiste :( ")
            vida--
        }
    } while (vida > 0)
}