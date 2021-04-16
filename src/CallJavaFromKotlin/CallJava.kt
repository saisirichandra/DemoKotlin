package CallJavaFromKotlin

class CallJava {
}

fun main(args: Array<String>) {
    val customer = Customer("Chandra")
    println(customer.name)
    println(customer.placeOrder())
}