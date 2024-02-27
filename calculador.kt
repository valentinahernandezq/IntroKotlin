package com.example.introkotlin

import kotlin.math.pow
import kotlin.math.sqrt

class calculadora {
}

fun main(){
    print("Ingrese la operacion que desee realizar (1 Suma | 2 Resta | 3 Multiplicacion " +
            "| 4 Division | 5 Raiz cuadrada | 6 Potenciacion: ")
    var operacion = readLine()!!.toInt()
    print("Ingrese el primer numero: ")
    var n1 = readLine()!!.toDouble()
    print("Ingrese el segundo numero: ")
    var n2 = readLine()!!.toDouble()

    when( operacion){
        1 -> print(n1 + n2)
        2 -> print(n1 - n2)
        3 -> print(n1 * n2)
        4 -> print(n1 / n2)
        5 -> print("La raiz de $n1 es: " + sqrt(n1) + " y la raiz cuadrada de $n2 es: " + sqrt(n2))
        6 -> print("La potencia es: " + n1.pow(n2))
    }
}