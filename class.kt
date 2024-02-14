class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(id = 1, email = "luizgcmiranda@gmail.com")

    println(contact.id)
    println(contact.email)

    contact.email = "jane@gmail.com"

    println(contact.email)
}