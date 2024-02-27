package com.example.introkotlin

class caraSello {
}

fun main(){

    print("¿Cuantas veces quiere jugar cara o sello?")
    var n = readLine()!!.toInt()

    for(i in 1..n){

        print("Ingrese 1 si escoge cara o 2 si escoge sello: ")
        var desicion = readLine()!!.toInt()

        var rand = ((1..2).random())

        if(desicion == rand){
            println("Ganaste!! :)")
        }else{
            println("Perdiste, sigue intentando :( ")
        }
    }
}