fun main() {

    var a = "Initial"
    println(a)

    a = "Final"
    println(a) // O var é mutável, sendo possível ser substituído.

    val b: Int = 1
    val c = 3

    println(b) // O var é imutável, não sendo possível ser substituído.
    println(c)

    val d: Int
    var e: Int

    fun someCondition() = true

    if (someCondition()) {
        d = 1
        e = 2
        println("O 'd' contém o valor: $d e o 'e' contém o valor: $e caso someCondition seja true.")
    } else {
        d = 2
        e = 3
        println("O 'd' contém o valor: $d e o 'e' contém o valor: $e caso someCondition seja false.")
    }

    println(d)
    println(e)
    // d = 10 Kotlin: Val cannot be reassigned (Não posso adicionar no val por ser imutável)

    e = 20 // Adicionado com sucesso por conta do 'e' ser um var.
    println(e)

}