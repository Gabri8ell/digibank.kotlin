package one.digibank

class Analista (
    name: String,
    cpf: String,
    salario: Double,
    cargo: String

) : Funcionario(name, cpf, salario, cargo) {

    override fun calcularAuxilio(): Double = salario.times(0.2)
}