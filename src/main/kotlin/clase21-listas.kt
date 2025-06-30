package org.example

import kotlin.reflect.typeOf



fun main(args: Array<String>) {
    val listaNombres = listOf<Any>( 4 , "Cristian", "Juan Pablo", "Fede", "Nestor")
    println(listaNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Aramis")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor = listaNombres.first()
    println(primerValor)

    val primerValorONull : String? = null
    primerValorONull?.firstOrNull()
    println(primerValorONull)


    listaVacia.addAll((listOf("Mariano" , "Alan")))
    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.removeIf{ caracteres -> caracteres.length <= 4 }
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4,5)
    println("Nuestro array ${myArray}")
    println("Array como lista ${myArray.toList()}")

    listaNombres.forEach { el -> println( el.javaClass )}
    println(message = "El tamaño de la lista es de ${listaNombres.size} unidades ")

    val filtradoDeMyArray = myArray.filter { it == 2 || it == 5 }
    println(filtradoDeMyArray)
}



