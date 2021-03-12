package one.digitalinnovations.collections

fun main () {
    var values = intArrayOf(2, 3, 4, 1, 10, 7) //criando array já instanciado sem informar tamanho

    values.forEach{
        println(it)
    }

    println("-------------------------")
    values.sort() //comando para ordernar array
    values.forEach{
        println(it)
    }
}