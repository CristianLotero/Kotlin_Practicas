package org.example

fun main(args: Array<String>) {
    val numerosDeLoteria = listOf(13,8,5,55,34,21)

    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDescendiente = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendiente)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { num -> num > 20 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println("se muestra la lista en reversa: $numerosEnReversa")

    val mensajesDeNumeros = numerosDeLoteria.map {
        numero -> "Tu numero de loteria es ${numero}"
    }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { num -> num > 22 }
    println("El numero filtrado es: $numerosFiltrados")

    val numerosEncadenados = numerosDeLoteria.filter { num -> num < 22 }.map { num -> "numero: $num" }
    println("Los numeros seleccionados son: $numerosEncadenados")
}