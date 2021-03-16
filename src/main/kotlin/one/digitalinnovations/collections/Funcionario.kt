package one.digitalinnovations.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salários: $salario
        """.trimIndent()
    // $nome significa interpolação de variaverl ou referencia dentro de uma string

}