package com.example.lib

class CuentaBancaria (val titular: String){
    var saldo: Double = 0.0

    fun depositar(cantidad: Double){
        saldo += cantidad
        println("Nuevo saldo: $saldo")
    }
    fun retirar(cantidad: Double){
        if (cantidad <= saldo){
            saldo -= cantidad
            println("Retiro exitoso: $saldo")
        }else {
            println("¡Error! no hay saldo suficiente. Tu saldo es: $saldo")
        }
    }

    fun mostrarSaldo(){
        println("Tu saldo actual es de: $saldo")
    }
}

fun main(){
    val cuenta = CuentaBancaria("Maria Garcia")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)
    cuenta.mostrarSaldo()
}