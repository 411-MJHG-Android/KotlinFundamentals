package com.pjasoft.lib

fun main () {
    val calificaciones = listOf(45, 72, 91, 60,85)

    for (cal in calificaciones){
        val nivel = if (cal < 60){
            "Reprobado"
        }else if (cal < 70){
            "Suficiente"
        }else if (cal < 80){
            "Bien"
        }else if (cal < 90){
            "Notable"
        }else {
            "Exelente"
        }

        println("$cal -> $nivel")
    }
}