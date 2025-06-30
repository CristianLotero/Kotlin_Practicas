package org.example

fun main (args: Array<String>) {
    val celulares = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Heawei Redmi 9", "Xiaomi mi a3").apply {
        removeIf { celular -> celular.contains("Google")}
    }
    println(celulares)

//    val colores : MutableList<String>? = null
    val colores : MutableList<String> = mutableListOf("Aguamarina", "Verde esmeralda", "Magenta")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }
}

//La Función apply
// El propósito de la función apply es tomar como alcance al objeto recibidor T sobre el que es invocado, aplicar las sentencias del parámetro block que recibe sobre dicho contexto y retornar el mismo objeto modificado.

//inline fun <T> T.apply(block: T.() -> Unit): T

