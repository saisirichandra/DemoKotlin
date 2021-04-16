package collections

class AssociateBy {
}
data class Person(val name: String, val city: String, val phone: Int)

val people = listOf<Person>(
    Person("eswar","bangalore",12345),
    Person("chandra","bangalore",455677),

    Person("ihlet","hyd",1234567),
    Person("karthik","hyd",678779))
fun main() {
    val phoneBook = people.associateBy { it.city }
    println(phoneBook)
}