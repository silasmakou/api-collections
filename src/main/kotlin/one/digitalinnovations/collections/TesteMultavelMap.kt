package one.digitalinnovations.collections

fun main() {
    val joao = Funcionario("Joao",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val maria = Funcionario("Maria",4000.0,"CLT")

    val repositorio = Repositorio<Funcionario>() //instanciando classe repositorio passando objeto

    repositorio.create(joao.nome, joao) //passando nome como chave e joao como objeto
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome)) //imprimindo objeto com a chave joão

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach  { println(it) }

}