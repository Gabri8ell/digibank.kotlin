package one.digibank

class Gerente(
    name: String,
    cpf: String,
    cargo: String,
    salario: Double,
    private val senha: String
) :Funcionario (name, cpf, salario, cargo), Logavel{
    override fun calcularAuxilio(): Double {
        return  salario.times(0.5)
    }

    override fun login(): Boolean = "senha123" == senha

}