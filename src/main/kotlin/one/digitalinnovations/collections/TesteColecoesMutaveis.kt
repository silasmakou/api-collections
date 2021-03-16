package one.digitalinnovations.collections

fun main() {
    val joao = Funcionario("Joao",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val maria = Funcionario("Maria",4000.0,"CLT")

    println("------------ List ------------------")

    val funcionarios = mutableListOf(joao, maria)

    funcionarios.forEach{println(it)}

    println("------------------------")
    funcionarios.add(pedro) // inclusão de registro na lista devido o tipo mutable após inicialização
    funcionarios.forEach{println(it)}

    println("------------------------")
    funcionarios.remove(joao) // remoção de registro na lista devido o tipo mutable após inicialização
    funcionarios.forEach{println(it)}

    println("------------ Set ------------------")
    val funcionariosSet = mutableSetOf(joao)
    //funcionariosSet.forEach{println(it)}

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{println(it)}

    println("------------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}




}