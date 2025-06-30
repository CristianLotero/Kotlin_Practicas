package org.example

//fun main(args: Array<String>) {
//    val myLambda : (String) -> Int = {
//        valor -> valor.length
//    }
//    val lambdaEjecutada = myLambda("Este es el String random")
//    println(lambdaEjecutada)
//
//    val saludos = listOf("Mba`eichapa", "Hola", "bonjour")
//    val longitudDeSaludos = saludos.map (myLambda)
//    println(longitudDeSaludos)
//}


//fun main() {
//    val output = higherOrder( 2.0,  3.0) { a: Double, b: Double -> a + b}
//    println("Final Output $output")
//}
//
//
//fun higherOrder( a: Double, b: Double, fn: (Double, Double) -> Double): Double {
////    println(fn(a,b))
//    return fn(a,b)
//}

fun main(array: Array<String>) {
    val myLambda : (String) -> Int = {valor ->  valor.length}
    val myLambda2 : (String) -> String = {valor ->  valor.length.toString()}
    val myLambda3 : (String) -> Double = {valor ->  valor.length.toDouble()}
    println("Resultado de valor.length : ${myLambda("Fernando")}")
    println("Resultado de valor.length.toString : ${myLambda2("Mi Firma")}")
    println("Resultado de valor.length.toDouble : ${myLambda3("Mi Firma")}")

    val typeOfMyVariable = myLambda("Mi Firma")::class.simpleName
    val typeOfMyVariable2 = myLambda2("Mi Firma")::class.simpleName
    val typeOfMyVariable3 = myLambda2("Mi Firma")::class.simpleName

    println("Typo de variable esperable Int: ${typeOfMyVariable}")
    println("Typo de variable esperable Int: ${typeOfMyVariable2}")
    println("Typo de variable esperable Int: ${typeOfMyVariable3}")

    val comparacionDe8s : Boolean = typeOfMyVariable == typeOfMyVariable2
    val comparacionDe8s2 : Boolean = typeOfMyVariable == typeOfMyVariable3
    val comparacionDe8s3 : Boolean = typeOfMyVariable == typeOfMyVariable
    println("Resultado de comparacion entre tipos de datos de typeOfVariable y typeOfVariable2 : $comparacionDe8s")
    println("Resultado de comparacion entre tipos de datos de typeOfVariable y typeOfVariable3 : $comparacionDe8s2")
    println("Resultado de comparacion entre tipos de datos de typeOfVariable y typeOfVariable : $comparacionDe8s3")
}

// El identificador it
//Cuando tu lambda usa un unico argumento y no piensa cambiar su nombre por cuestiones de legibilidad, puedes usar el identificador <it>.
//Esta variable se deduce implicitamente con el tipo inferido por el compilador y puedes referirte a ella como tu parametro.
//Por ejemplo, si cambiamos el parametro explicito <Char> por <it> tendrias:
//
//Ejemplo sin <it> :
    val eCountSinIt = "develou.com".count() { char -> char == 'e'}

//Ejemplo con <it>
    val eCountConIt = "develou.com".count() { it == 'e'}


// Lambdas con multiples lineas

//Es posible escribir una lambda con varias lineas en su cuerpo. Solo pon las expresiones dentro del parentesis normalmente. La Ultima linea sera el resultado del lambda.
//
//Por ejemplo, expandamos el predicado para count() y antepongamos una linea donde imprimas cada caracter procesado:

fun multipleLambdas() {
    val eCount = "develou.com".count {
        println("Caracter $it")
        it == 'e'
    }
    print("Total 'e': $eCount")
}
