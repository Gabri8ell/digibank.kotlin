package one.digibank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String

) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "senha568" == senha

    override fun toString(): String = """
        Nome: $name
        CPF: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}