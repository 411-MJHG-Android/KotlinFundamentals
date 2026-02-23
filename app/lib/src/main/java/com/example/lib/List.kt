package com.pjasoft.lib

fun main(){
    val numbers =  listOf<Int>(32,25,899,654,357)
    val dynamicNumbers = mutableListOf(2,3,545,963,41)
    var maxNumber = numbers[0]
    for (number in numbers){
        if (number > maxNumber){
            maxNumber = number
        }
        println(number)
    }
}

