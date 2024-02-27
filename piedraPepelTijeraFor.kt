package com.example.introkotlin

class piedraPepelTijeraFor {
}

fun main() {

    print("¿Cuantas vidas quieres?")
    var vida = readLine()!!.toInt()

    for(n in 1..vida){
        println("Escribe 1 para piedra, 2 para tijera y 3 para papel: ")
        var jugada = readLine()!!.toInt()

        var rand = ((1..3).random())

        if(jugada == rand){
            println("Empate, juega de nuevo :) ")
        }
        if(jugada == 1 && rand == 2){
            println("Ganaste!! ")
        }
        if(jugada == 1 && rand == 3){
            println("Perdiste :( ")
        }
        if(jugada == 2 && rand == 1){
            println("Perdiste :( ")
        }
        if(jugada == 2 && rand == 3){
            println("Ganaste!! ")
        }
        if(jugada == 3 && rand == 1){
            println("Ganaste!! ")
        }
        if(jugada == 3 && rand == 2){
            println("Perdiste :( ")
        }
    }
}
