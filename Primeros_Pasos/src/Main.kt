import kotlin.math.sqrt

//
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun message(): String {
    return "Hello im a IA"
}

fun info(){
    println("Esta funcion no retorna nada")
}

fun saludar(name:String){
    println("Hola $name")
}

fun main() {
    // Variables
    var name = "Kotlin"
    var lastname: String= "Rivas"
    var age: Int= 18
    var height: Double = 155.0
    var weight: Float = 48.0f
    var single: Boolean= false

    println("Hello $name, i am $age years old")

    // Constantes

    val pi = 3.14

    var area = pi * (5*5)

    // Funciones

    var result= add(5,20)
    println("El resultado de la suma es: $result")

    println(message())
    info()
    saludar(name)

    // Condicionales

    if (age>=18){
        println("Eres mayor de edad")
    } else if(age in 20..29){
        println("Estas en los 20's")
    } else {
        println("Estas en el mayor de edad")
    }

    // Ternario

    var message = if (age>=18) "Eres mayor de edad" else "eres menor de edad"
    println(message)

    // Switch

    when(height){
        10.0 -> println("Estas pequeño")
        200.0-> println("Estas alto")
        else -> println("No se que decir")
    }

    // Ciclos
    println("Ciclo for")
    for(i in 1..5){
        println("Numero $i")
    }

    println("Ciclo while")
    while (j<=5){
        j++
        println("Numero $j")
    }

    println("Ciclo do")

    //Clases

    class auto(
        var marca: String,
        var velocidad: Double,
        var color: String,
        var prendido: Boolean
    ){



    fun arrancar(){
        prendido= true
    }

    fun pintar(){
        this.color = color
    }
    }
}