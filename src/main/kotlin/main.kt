fun main() {
//    println("Bem vindo ao Bytebank")
//    testaComportamentosConta()
//    testaFuncionarios()
//    testaContasDiferentes()
//    testaCopiasEReferencias()
//    testaFuncionarios()

    val gerente = Gerente(
            nome = "Alex",
            cpf = "111.111.111.11",
            salario = 1000.0,
            senha = 1000
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222.22",
        salario = 1000.0,
        senha = 1000,
        plr = 200.0


    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(gerente, 2000)

}










