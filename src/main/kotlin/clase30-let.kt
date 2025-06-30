package org.example

//recordatorio: <?.> operador de safe cast

fun main(args : Array<String>) {
    var nombre : String? = null
    nombre?.let{
        valor -> println("El nombre no es nulo, es $valor")
    }
    nombre = "Cristian"
    nombre?.let {
        valor -> println("No voy a usar el mismo mensaje, este es nuevo, el nombre no es nulo, es $valor")
    }

}

