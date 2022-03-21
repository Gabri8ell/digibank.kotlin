package one.digibank.teste

import one.digibank.Banco
import one.digibank.Gerente

fun main() {
    var g1 = Gerente("Edilene", "12456789-85", "Gerente", 5000.00)

    ImprimeRelatorioFuncionario.imprime(g1)

}