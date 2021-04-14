class EquityCheck {
}

public fun main() {
    val ListAuthors = setOf<String>("Author1","Author2")
    val ListWriters = setOf<String>("Writer1","Writer2")
    var ListAuthors2 = setOf<String>("Author2","Author1")
    println((ListAuthors==ListWriters))
    println(ListAuthors===ListAuthors2)
}