open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double

) {
    //properties
    open val bonificacao: Double
        get() = salario * 0.1

    //properties
//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

    //function
//    open fun bonificacao(): Double {
//        return salario * 0.1
//    }

}