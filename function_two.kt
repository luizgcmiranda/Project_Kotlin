fun soma(a: Int, b: Int): Int {
    return a + b
}

fun substracao(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

fun divisao(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    val resultadoSoma = soma (10, 20)
    println("Resultado da soma: $resultadoSoma.")

    val resultadoSubtracao = substracao (20, 10)
    println("Resultado da subtração: $resultadoSubtracao.")

    val resultadoMultiplicacao = multiplicacao (10, 2)
    println("Resultado da multiplicação: $resultadoMultiplicacao.")

    val resultadoDivisao = divisao (10, 2)
    println("Resultado da divisão: $resultadoDivisao.")
}