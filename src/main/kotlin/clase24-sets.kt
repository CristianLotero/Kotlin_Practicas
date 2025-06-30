package org.example

fun main(args: Array<String>) {
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println("Set de vocales: $vocalesRepetidas")


    val numerosMutables = mutableSetOf(1, 2, 3, 4)
    println("Set de numeros mutables: $numerosMutables")
    numerosMutables.add(5)
    numerosMutables.add(4)
    println("Set de numeros mutables luego de agregar el 5: $numerosMutables")

    numerosMutables.remove(1)
    println("Set luego de eliminar el 1: $numerosMutables")

//    como obtener los elementos de los set

//    utilizando el metodo .firstOrNull envez del .first lo que evitamos es que crashee el programa con un null
    val valorDelSet: Int? = numerosMutables.firstOrNull { num -> num > 5 }
    println("Valor del set (segun el callback num-> num > 2) resultado : $valorDelSet")

    val setPrimero = setOf(1, 6, 4, 5, 5, 5, 3, 4)
    println(
        " resultado de comparacion de <setPrimero (1,6,4,5,5,5,3,4) == setOf(1,3,4,5,6)> es: ${
            setPrimero == setOf(
                1,
                3,
                4,
                5,
                6
            )
        }"
    )

//    utilizar .contains() para evaluacion booleana o el operador <in>
    println(message = ("setPrimero.contains(2) resultado: ${setPrimero.contains(2)}"))
    println(message = ("setPrimero.contains(4) resultado: ${setPrimero.contains(4)}"))
    println(message = ("4 in setPrimero resultado: ${4 in setPrimero}"))

//    para averiguar si contiene un subconjunto utilizar metodo .containsAll(elements)
    println(message = ("setPrimero.containsAll(5,6) resultado: ${setPrimero.containsAll(setOf(5,6))}"))

//    añadir elementos a set mutable mediante operador de adicion compuesta <+=> o eliminar elementos mediante resta compuesta <-=>
    println("numerosMutables: $numerosMutables")
    numerosMutables  += 6
    numerosMutables  += 1
    println("numerosMutables agregando 1 y 6 mediante <+=> : $numerosMutables")
    numerosMutables  -= 1
    println("numerosMutables eliminando elemento '1' mediante <-=>: $numerosMutables")

//    La funcion union()
    val pares = setOf(2,4,6,8)
    val impares = setOf(1,3,5,7)
    val paresEimpares = pares union impares
    println("Union de sets = ${pares union impares}")
    println("paresEimpares : $paresEimpares")

//    La funcion intsect()
    println("Intersect de numerosMutables y paresEImpares = ${numerosMutables intersect paresEimpares}")

//    La funcion subtract()
    println("diferencia entre paresEImpares y numerosMutables : ${paresEimpares subtract numerosMutables}")

}





