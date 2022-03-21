package one.digibank

class Gerente(
    name: String,
    cpf: String,
    cargo: String,
    salario: Double
) :Funcionario (name, cpf, salario, cargo){
    override fun calcularAuxilio(): Double {
        return  salario.times(0.5)
    }

}