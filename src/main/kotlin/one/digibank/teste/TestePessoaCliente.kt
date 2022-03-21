package one.digibank.teste

import one.digibank.Cliente
import one.digibank.ClienteTipo
import one.digibank.Logavel
import one.digibank.Pessoa

fun main(){
    val c1 = Cliente("Gabriel", "123456789-89", ClienteTipo.PF, "senha568")

    println(c1)
    TesteAutenticacao().autentica(c1)
}