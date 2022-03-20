package one.digibank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info(): String = "$nome, $numero"
}
