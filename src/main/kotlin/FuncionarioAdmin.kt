abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int

) {
    //properties abistrato a classe mãe não e responsavel pela implementação
    abstract val bonificacao: Double

    fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }

        return false
    }
}