package one.digitalinnovations.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal() // usando a função de string para converter em bigdecimal
    )

    println("----------------------")
    println(salarios.somatoria())

    println("----------------------")
    println(salarios.media())

}