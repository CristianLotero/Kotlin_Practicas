package org.example

fun main(args: Array<String>) {
    imprimirNombre(nombre = "Cristian", apellido = "Lotero Aquino")
}

fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String) {
//    println("Mi nombre es   $nombre y mi apellido es $apellido")
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}
