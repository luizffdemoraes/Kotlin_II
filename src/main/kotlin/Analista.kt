class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    //Herança reutilizar comportamentos
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {


    override val bonificacao: Double
        get() {
            println("bonificação analista")
            return super.bonificacao + salario * 0.1
        }


}