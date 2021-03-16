package one.digitalinnovations.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0) // to significa sintax o recurso infix para possibilitar inclusão em Pair

    println("----------------------------------")

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")}
}