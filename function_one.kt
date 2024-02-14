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

fun main() {

    printGitHub("Hello, world!")

    printGitHubFormatted("O valor de pi é %.2f", Math.PI)

    printColored(" This is red text", "red")

}