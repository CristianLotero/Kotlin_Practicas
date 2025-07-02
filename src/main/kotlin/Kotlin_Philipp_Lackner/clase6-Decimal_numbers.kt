package Kotlin_Philipp_Lackner

import org.example.PI
import kotlin.math.pow

//fun main(){
//
//
//    var x  = 20.3546798356456457334563456
//    var y  = 5.2
//    var result = x / y
//    println("The result of x / y is: ${result}")
//}

//Use this formula for the volume: 0.75 * pi * radius^3
// The volume of the sphere with the radius 5.5 is 392.0118578578125

fun main() {
    var height: Double  = 0.75
    var pi = kotlin.math.PI
    var radius: Double = 5.5
    var exponent: Double = 3.0

//    println(pi)
    println("The volume of the sphere is: ${height * pi * radius.pow(3)}")
}