package one.digibank

import java.math.BigDecimal

class Conta(
    val Agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal ): BigDecimal {
        return saldo
    }

    fun saque(valor: BigDecimal) {

    }
}