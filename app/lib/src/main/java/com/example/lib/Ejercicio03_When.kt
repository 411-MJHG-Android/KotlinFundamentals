package com.pjasoft.lib

fun main(){
    val dias = listOf(1, 4, 7, 9, 3, 6)

    for (d in dias){
        val nombre = when (d){
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"
            else -> "Dia no valido"
        }

        println("$d -> $nombre")
    }
}