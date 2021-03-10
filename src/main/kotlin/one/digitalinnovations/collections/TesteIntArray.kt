package one.digitalinnovations.collections

fun main() {
    var values = IntArray(5) // criando um Array do tipo int

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for(valor in values){ // declarando uma varivael valor para iterar
        println(valor)
    }
    println("-----------------------------")
    values.forEach {
        println(it) //forEach é uma expressão lambda que tem uma variavel it
    }
    println("-----------------------------")
    values.forEach {valor->
        println(valor) //forEach é uma expressão lambda que tem uma variavel it
    }
    println("-----------------------------")
    for (index in values.indices){ // iterando referenciando os indices do array
        println(values[index])
    }

    println("-----------------------------")
    values.sort() //recurso de array para ordernar do menor para o maior
    for (valor in values){ // iterando referenciando os indices do array
        println(valor)
    }
}

