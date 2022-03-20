package one.digibank

class Pessoa {
    var name: String = "Jhenifer"
    var cpf: String = "123.456.789-25"
    private set

    constructor()

    fun pessoaDetail():String = "Nome : $name \nCPF: $cpf"

}

fun main(){
    val milacam = Pessoa()

    println(milacam.pessoaDetail())

}
