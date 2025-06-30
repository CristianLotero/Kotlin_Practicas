package org.example

fun main (args: Array<String>) {
    val colores = listOf("Azul", "Aguamarina", "Verde agua", "Naranja")
    with(colores) {
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }
}


//inline fun <T, R> with(receiver: T, block: T.() -> R): R