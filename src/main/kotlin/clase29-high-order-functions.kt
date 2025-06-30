package org.example



fun functionInception(nombre: String) : () -> String {
    return {
        "Hola desde la lambda $nombre, como te va? \n como te sentis?"
    }
}

fun main(args: Array<String>) {
//    val largoDeValorInicial = superFunction(valorInicial = "Hola, como te va ${nombre}? \n como te sentis?", block = {  valor ->
//        valor.length
//    })
    val lambda: () -> String = functionInception("Cristian")
    val valorLambda: String = lambda()
    val largoDeValorInicial = superFunction(valorLambda, block = { valor ->
        valor.length
    })
    println("El largo de la cadena de texto es: $largoDeValorInicial")

    println(valorLambda)

}

fun superFunction(valorInicial: String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

