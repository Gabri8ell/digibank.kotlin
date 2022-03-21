package one.digibank

import java.math.BigDecimal

abstract class Funcionario (
    name: String,
    cpf: String,
    val salario: Double,
    val cargo: String
): Pessoa(name, cpf){
    abstract fun calcularAuxilio(): Double

    override fun toString(): String = """
        Nome: $name
        CPf: $cpf
        Cargo: $cargo
        Salário: R$$salario
        Auxílio: R$${calcularAuxilio()}
    """.trimIndent()//formata o texto


}