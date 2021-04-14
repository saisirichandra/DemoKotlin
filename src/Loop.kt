class Loop {
}

fun main() {
    var names = listOf("sai","siri","chandra","venu")
    var index = 0
    while( index <names.size) {

        println("${names[index]} string length is ${names[index].length}")
        index++
    }
    var concat="hey"+"hello"
    print(concat)
}