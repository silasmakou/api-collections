package one.digitalinnovations.collections

fun main() {

    val joao = Funcionario("Joao",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val maria = Funcionario("Maria",4000.0,"CLT")

    val funcionarios = listOf(joao, pedro, maria) // usando a função listOf para passar coleção de objetos

    funcionarios.forEach { println(it)}

    println("----------------------------")

    println(funcionarios.find {it.nome == "Maria"} ) // pesquisando elemento cujo membro nome seja igual a Maria

    println("----------------------------")

    funcionarios .sortedBy { it.salario } .forEach{println(it)} // encadeamento de metodos coletores

    println("----------------------------")
    funcionarios
        .groupBy { it.tipoContratacao } // agrupando
        .forEach{println(it)}
}