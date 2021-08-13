package one.digitalinnovation.dionebank

class Pessoa {
    var nome: String = "Victor"
    var cpf: String = "123.123.123-11"
    private set

}

fun main() {
    val victor = Pessoa()

    println(victor.nome)
    println(victor.cpf)

}