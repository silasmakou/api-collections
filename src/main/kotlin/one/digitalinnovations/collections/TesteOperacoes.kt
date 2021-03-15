package one.digitalinnovations.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.00)

    for (salario in salarios){
        println(salario)
    }

    println("---------------------------------")
    println("Maior salario:  ${salarios.maxOrNull()}") // função maior
    println("Menor salario: ${salarios.minOrNull()}") //função menor
    println("Média salario: ${salarios.average()}") //função média salario

    val salariosMarioQue2500 = salarios.filter {it > 2500.0}
    //operação filter passamos uma expressão que toda vez que ela estiver sobre o objeto que esta em iteração, valida se ela é verdade ou não
    println("---------------------------")
    salariosMarioQue2500.forEach {println(it)}

    println("---------------------------")
    println(salarios.count {it in 2000.0..5000.0}) //operação para verificar quantos elementos dentro do Array estão dentro do range informado

    println("---------------------------")
    println(salarios.find {it == 2250.0}) //operação retorna o valor do item do array igual ao da expressão
    println(salarios.find {it == 500.0})

    println("---------------------------")
    println(salarios.any {it == 1000.0}) //operação verifica se dentro de algum elemento a expressão seja verdadeira
    println(salarios.any {it == 500.0})

}