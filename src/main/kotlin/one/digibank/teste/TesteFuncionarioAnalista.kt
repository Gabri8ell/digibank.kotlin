package one.digibank.teste

import one.digibank.Analista
import one.digibank.Funcionario
import java.math.BigDecimal

fun main() {
    val analista1 = Analista(name = "Gabriel", cpf = "12345789-89", salario = 2500.00, cargo = "Analista")

    ImprimeRelatorioFuncionario.imprime(analista1)

    //val cont = 5
}