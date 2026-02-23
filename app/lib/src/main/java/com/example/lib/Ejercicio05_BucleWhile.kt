package com.pjasoft.lib

fun main(){
    val numeros = listOf(12345, 9081, 100)

    for (n in numeros){
        var numero = n
        var suma = 0

        while (numero > 0){
            suma += numero % 10
            numero /= 10
        }
        println("Suma de digitos de $n: $suma")
    }
}

