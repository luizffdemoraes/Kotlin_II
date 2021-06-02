abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int

) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    //properties abistrato a classe mãe não e responsavel pela implementação

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }

        return false
    }
}