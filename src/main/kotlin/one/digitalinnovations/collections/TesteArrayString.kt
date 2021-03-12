package one.digitalinnovations.collections

fun main() {
    var nomes = Array(3){""} //Utilizar a class Array, tamanho e se inicializar não precisa dizer o tipo
    nomes[0] = "maria"
    nomes[1] = "joão"
    nomes[2] = "josé"

    for(nome in nomes){
        println(nome)
    }

    println("--------------------------")
    nomes.sort()
    nomes.forEach { println(it) } // forEach é uma função lambda e o it é o id do objeto como so tem um não precisa declarar


    var nomes2 = arrayOf("maria","zazá","josé") // froma diferente de declarar Array, é necessário usar a função ArrayOf

    println("--------------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}