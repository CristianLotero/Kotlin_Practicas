package org.example

const val PI = 3.1416//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")
    var dinero : Int = 10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre1 = "Maria"
    println(nombre1)
    println(PI)

    val boolean = true
    /* al ponernos con el cursor sobre el tipo de variable (por ejemplo
    sobre Double) y precionamos alt + enter , nos aparece el menu donde
    podemos eliminar esa declaracion de tipo porque kotlin ya lo infiere
     */
    val numeroLargo = 3L
    val double : Double = 2.7182
    val float : Float = 1.1f

    val primerValor = 20
    val segundoValor = 10

    val tercerValor =  segundoValor - primerValor
    println(tercerValor)

    val apellido = "Lotero Aquino"
    val nombre2 = "Cristian"
    val nombreCompleto = "Mi nombre es $nombre2 $apellido"
    println(nombreCompleto)
}

