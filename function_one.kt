fun printGitHub(message: String) {
    println(message)
}

fun printGitHubFormatted(message: String, vararg args: Any) {
    println(String.format(message, *args))
}

fun printColored(message: String, color: String) {
    val ANSI_RESET = "\u001B[0m"
    println("$ANSI_RESET[$color$message$ANSI_RESET]")
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (ms in messages)
        println(prefix + ms)
}

fun printTest1(vararg messages: String, prefix: String) {
    messages.forEach { println(prefix + it)}
}


fun main() {

    printGitHub("Olá, bem-vindo!")

    printGitHubFormatted("O valor de pi é %.2f", Math.PI)

    printColored(" Esse texto é vermelho", "red")

    printAllWithPrefix("Esse é um dos meus primeiros aprendizados com a linguagem", "Está sendo muito bom", "Estou me divertindo",
    prefix = "[ALERTA] - ")

    printTest1("Teste A", "Teste B", "Teste C", prefix = "[TESTE] - ")
}