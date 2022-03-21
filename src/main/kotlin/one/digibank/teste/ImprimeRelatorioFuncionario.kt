package one.digibank.teste

import one.digibank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}