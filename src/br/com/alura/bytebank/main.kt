fun main() {
    println("início main")

    val entrada: String = "1.0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }

    funcao1()
    println("fim main")
}
fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ArithmeticException) {
        e.printStackTrace()
        println("ArithmeticException foi pegada")
    }
    println("fim funcao1")
}
fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}
class SaldoInsuficienteException : Throwable("O Saldo é insuficiente")
