package org.example

fun main(args: Array<String>) {

    val listaDeFrutas = listOf("Manzana","Pera","Mango","Maracuya")
//    for (fruta in listaDeFrutas) println("Hoy me voy a deleitar con un/a $fruta")
    listaDeFrutas.forEach{ fruta -> println("Ahora voy a comer un/a $fruta") }

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { caracteresDeFrutaLength -> caracteresDeFrutaLength > 5}
    println(listaFiltrada)
}

