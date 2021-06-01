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

    val fran = Gerente(
        nome = "Fran",
        cpf = "079.684.730-47",
        salario = 5000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")

    if(fran.autentica(1234)){
        println("autenticou com sucesso")
    }else {
        println("falha na autenticação")
    }
}







