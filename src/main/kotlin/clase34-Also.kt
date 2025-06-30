package org.example

fun main(args: Array<String>) {
    val celulares = mutableListOf(
        "Google Pixel 2XL",
        "Google Pixel 4a",
        "Heawei Redmi 9",
        "Xiaomi mi a3",
        "Meizu 7Plus",
        "Iphone 7Plus",
        "Nokia 1100"
    ).also {
        println("El tamaño original de la lista es: ${it.size}")
    }.asReversed()
    println("La lista de celulares es :")
    for (value in celulares)
    println(value)
}


//inline fun <T> T.also(block: (T) -> Unit): T

//DATO IMPORTANTE SOBRE SCOPE FUNCTIONS
//apply y also devuelve el objeto contexto directamente. let, run, y with retorna el último valor de la lambda.
