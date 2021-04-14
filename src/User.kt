class User {
}

    data class User1(var name: String, val id: Int)

fun main() {
    var user = User1("chandra",1)
    var userSecond = User1("chandra",2)
    println(user)
    println(user.name)
    println(user.name.hashCode())
    println(userSecond.name.hashCode())

}