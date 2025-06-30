package org.example

fun main (args: Array<String>){
    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> println("El amarillo es el color de la precaucion")
        "Rojo" , "Carmesi" -> println("El ${nombreColor} es el color del peligro")

        else -> println("soy daltonico")
    }

    val code = 456

    when (code) {
        in 200..299 -> println("Todo de luxury")
        in 400..500 -> println("Algo ha fallado")

        else -> println("Codigo desconocido, algo ocurrio")
    }

    val tallaDeCalzado = 47

    val mensaje = when (tallaDeCalzado) {
        40,43,44,45 -> "Tenemos disponible ${tallaDeCalzado}"
        41, 42 ->"Casi no nos quedan, aprovecha ahora tus ${tallaDeCalzado}!"
        39,46 -> "Lo siento no tenemos disponible el numero ${tallaDeCalzado}"
        else -> "Solo tenemos stock del 41 al 45"
    }

    println(mensaje)
//    if ((nombreColor != "Amarillo") && (nombreColor != "Rojo")) {
//        println("No es ni chicha ni limonada...es ${nombreColor}")
//    }
}