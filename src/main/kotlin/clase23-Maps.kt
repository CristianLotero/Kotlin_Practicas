package org.example

fun main(args: Array<String>) {
    val edadDeSuperHeroes = mapOf<Any, Any>(
        "Ironman" to 35,
        "Spiderma" to 23,
        "Intruso" to true,
        "Captain America" to 99
    )
    println("la edad de los superheroes es : $edadDeSuperHeroes")

    val edadMutableDeSuperHeroinas = mutableMapOf(
        "Storm" to 25,
        "Black Widow" to 30,
        "Wonder woman" to 24
    )
    println("la edad de las superheroes es : $edadMutableDeSuperHeroinas")

    edadMutableDeSuperHeroinas.put("Batigirl",19)
    println("Agregando Batigirl : $edadMutableDeSuperHeroinas")

    edadMutableDeSuperHeroinas["Capitana Marvel"] = 40
    println("Agregando Capitana Marvel: $edadMutableDeSuperHeroinas")

    val edadIronman = edadDeSuperHeroes["Ironman"]
    println("Leyendo el Value de Ironman ( que seria la edad) : $edadIronman")

    edadMutableDeSuperHeroinas.remove("Storm")
    println("eliminando a Storm, el MAP ahora queda asi: $edadMutableDeSuperHeroinas")

    println("lista de keys : ${edadMutableDeSuperHeroinas.keys}")
    println("lista de values : ${edadMutableDeSuperHeroinas.values}")
    println("lista de entries : ${edadMutableDeSuperHeroinas.entries}")
    println("lista de entries : ${edadMutableDeSuperHeroinas.entries}")
    println("lista de cantidad de entradas : ${edadMutableDeSuperHeroinas.size}")


    val encontrandoAlIntruso = edadDeSuperHeroes.getOrDefault(key = "Intruso", defaultValue = 0)
    println("Respuesta de busqueda de intruso: $encontrandoAlIntruso")

    println("Resultado de eliminacion de Capitana Marvel: ${edadMutableDeSuperHeroinas.remove("Capitana Marvel", 34)}")
    println("Viendo si se elimino Capitana Marvel: $edadMutableDeSuperHeroinas")
    println("Resultado de eliminacion de Capitana Marvel: ${edadMutableDeSuperHeroinas.remove("Capitana Marvel", 40)}")
    println("Viendo nuevamente si se elimino Capitana Marvel: $edadMutableDeSuperHeroinas")

//    recorrer un mapa con ciclo for
    for((hero, age) in edadDeSuperHeroes) {
        println("La edad de $hero es $age")
    }


}