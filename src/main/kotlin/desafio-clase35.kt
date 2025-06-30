package org.example


// Las funciones .also repiten el codigo en todos los sitios...sacar ese codigo a una variable, y usar esa variable en los mismos .also


// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(args: Array<String>) {
    println("Hola soy tu bola 8 magica creada en Kotlin. Cual de estas opciones deceas realizar?")
    println("1. Realizar una pregunta")
    println("2.Revisar una pregunta")
    println("3. Salir")

    val valorIngreado = readLine()

    when(valorIngreado) {
        "1" -> realizarPregunta.also {
            println("Que pregunta deseas realizar?")
            readLine()
            println("Asi que esa era tu pregunta... La respuesta a eso es: ")
            val respuestaGenerada = respuestas.keys.random()
            println(respuestaGenerada)
            }

        "2" -> mostrarRespuesta.also {
            println("Selecciona una opcion")
            println("1. Revisar todas las respuestas")
            println("2. Revisar solo las respuestas afirmativas")
            println("3. Revisar solo las respuestas dudosas")
            println("4. Revisar solo las respuestas negativas")

            val opcionIngresada = readLine()
            when(opcionIngresada){
                "1" -> mostrarRespuestaPorTipo()
                "2" -> mostrarRespuestaPorTipo(tipoDeRespuesta = RESPUESTA_AFIRMATIVA)
                "3" -> mostrarRespuestaPorTipo(tipoDeRespuesta = RESPUESTA_NEGATIVA)
                "4" -> mostrarRespuestaPorTipo(tipoDeRespuesta = RESPUESTA_DUDOSA)
                else -> println("Respuesta no valida. Adios!!")
            } }

        "3" -> salir.also {
            println("Hasta luego!!")
        }

        else -> mostrarError.also {
            println("Parece que elegiste una opcion no valida!")
        }
    }
}

val mostrarError = fun (){}


val salir = fun(){}

val mostrarRespuesta = fun(){}

val realizarPregunta = fun(){}

fun mostrarRespuestaPorTipo(tipoDeRespuesta: String = "TODOS") {
    when(tipoDeRespuesta) {
        "TODOS" -> respuestas.keys.forEach { respuesta -> println(respuesta) }
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }

        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }

    }
}

