fun main() {
    println("Bem vindo ao Bytebank")

    testaComportamentosConta()

    val alex = Funcionario(
        nome = "Alex",
        cpf = "099.934.600-87",
        salario = 2500.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println(("bonificacao ${alex.bonificacao()}"))
}







