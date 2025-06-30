package org.example

fun main(args: Array<String>) {
    var nombre : String? = null
    try {
        throw NullPointerException("Ocurrio un error de referencia nula")
    } catch (exception : NullPointerException){
        println("Ha ocurrido un error...pero imprime raro el msj")
    } finally {
        println("Finalmente ha ocurrido un error.... Cerrando aplicacion")
    }

    val primerValor = 5
    val segundoValor = 0

    val result : Int = try {
        primerValor/segundoValor
    } catch (exception : Exception) {
        100
    }
    println(result)

}