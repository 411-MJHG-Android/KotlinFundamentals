package com.pjasoft.lib

/*PRINCIPIOS DE POO
Herencia
Polimorfismo
Encapsulamiento
Abstraccion
* */

class Person (val name :  String, val age : Int) {
    fun sayHello(){
        println("Hola soy $name y tengo $age")
    }

    fun main() {
        //Dos metodos
        val persona = Person("Maria Jose", 20)
        val persona2 = Person(age = 28, name = "Majo")
        persona.sayHello()
        persona2.sayHello()

        println("El nombre de la persona 1 es ${persona.name} ")

        val squere1 = Square(side = 34.5)
        val squere2 = Square(side = 12.3)
        val circulo = Circle(radius = 10.0)

        val cat = Cat("Gato")
        cat.trepar(3, "La Salle")

        //Polimorfismo
        val shapes = listOf<Shape>(squere1,squere2,circulo)
        for (shape in shapes){
            println(shape.calculateArea())
        }


    }

    //Interface: es un contrato
    interface Ave {
        fun fly()
        fun poop()
        fun peep()
        fun coito()
    }

    //Hechar vistaso al principios SOLID
    class Eegle : Ave{
        override fun fly() {
            TODO("Not yet implemented")
        }

        override fun poop() {
            TODO("Not yet implemented")
        }

        override fun peep() {
            TODO("Not yet implemented")
        }

        override fun coito() {
            TODO("Not yet implemented")
        }

    }

    open class Animal(val name : String){
        open fun makeSound(){
            println("$name esta haciendo un sonido")
        }
    }

    class Dog : Animal(name = "Bonnie"){

    }

    class Cat (val catName: String) : Animal (name = "gato"){
        fun trepar(stairs:Int, place:String){
            println("$name trepo $stairs escalones en  $place")
        }
    }



    //ABRSTACCION
    //Modelas solo lo importante
    //la diferencia entre luna pclase normal y una clase abstracta es que la abstracta no puede crear objetos

    /*METODOS EN KOTILIN
    Se definen con fun para refresar un dato se utiliza : tipo de dato
    fun clacularArea() : Double {
    retrun 1.0
    * */

    //Clase abstracta
    abstract class Shape() {
        abstract fun calculateArea() : Double
    }
    //Hernecia : Shape()
    class Circle (val radius: Double) : Shape(){
        override fun calculateArea(): Double {
            return radius * radius * Math.PI
        }
    }

    class Square(val side : Double) : Shape(){
        override fun calculateArea(): Double {
            return side * side
        }
    }

}