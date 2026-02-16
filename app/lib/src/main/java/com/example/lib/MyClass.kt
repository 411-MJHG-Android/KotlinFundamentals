package com.pjasoft.lib

fun main(){
    /* 1. Crea un progrmaa, que tenga un precio de comida y un procetaje de propina e
    eimprimir cuanto es el total a pagar
    * */
    println("Hola mundo")
    //1.
    val price : Double = 150.0
    val percentage : Double = 0.10
    val tip: Double = price * percentage
    val total : Double =  price + tip
    println("El costo de la comida es: $$total")


    //2. El portero de la discoteca. Verifica que una persona pueda entrar en la disco solo si
    //es mayor de edad
    println("Pon una edad")
    val input = readlnOrNull()
    val age =  input?.toIntOrNull() // ?: si input no es nuelo ejecuta lo de alado si lo es se queda nulo
    println("La edad es: $age")
    /*if(age == null){
        println("El numero que pusiste, no es un numero entero, insertalo bien!!")
    }else if(age > 18){
        println("Eres mayor de edad, pasale a la disco")
    }else{
        println("No puedes pasar :(")
    }

//    Ctrl K Ctrl C
    */

    //WHEN
    when(age){
        null -> println("Ingresa un numero valido")
        in 18..Integer.MAX_VALUE -> println("Puedes entrar")
        else -> println("No puedes pasar")
    }

    //DO WHILE -> Ejecuta priemel bloque de codigo y despues evaula la condicion
    var counter : Int = 12
    while(counter < 20){
        print("El contador es menor que 20")
        counter++
    }

    do {
        println("El contador vale menos que 30")
        counter++
    }
    while(counter < 30)

    //FOR
        //RANGOS
    for (i in 1 .. 10){
        println(i)
    }

    //CiCLO FOR AL REVEZ
    for(i in 10 downTo 2){
        println(i)
    }

    for(i in 100 downTo 0 step 10){
        println(i)
    }

    //Cambio importante
    //CAMBIO PENDIENTE
    //cambio que se me olvido
     val variable = 2
     val testinoc = 3
     val notSupportedError = 4

    // creando la funcionalidad de registrarse en la app

    //Creando la conexion con la api

}