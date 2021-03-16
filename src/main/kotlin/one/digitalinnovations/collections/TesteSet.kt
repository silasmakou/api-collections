package one.digitalinnovations.collections

fun main() {

    val joao = Funcionario("Joao",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val maria = Funcionario("Maria",4000.0,"CLT")

    val funcionarios1 = setOf(joao, pedro) // significa conjunto
    val funcionarios2 = setOf(maria) // significa conjunto

    val resultUnion = funcionarios1.union(funcionarios2) // união dos conjuntos

    resultUnion.forEach {println(it)} //iteração sobre a união

    println("------------------------------")
    val funcionarios3 = setOf(joao, pedro ,maria)
    val resultSubstract = funcionarios3.subtract(funcionarios2) // subtrai de funcionario3 o que tem no funcionario2
    resultSubstract.forEach {println(it)} //iteração sobre a união

    println("------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2) // obtem o que há em comum entre funcionario3 e funcionario2
    resultIntersect.forEach {println(it)} //iteração sobre a união



}