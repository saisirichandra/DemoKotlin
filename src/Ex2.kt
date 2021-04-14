class Ex2 {
}

fun main() {
    //var a=1
   // var name="Chandra$a pursuing bachelor's degree"
   // println(name)
    //var sentence = "${name.replace("chandra","ihlet")}"
   // print(sentence)
    val students= listOf("chandra","siri","ihlet")
    for (index in students.indices){
        println("Student at index $index is ${students[index]}")

    }
    var SortedStudents = students.sorted()
    println("The sorted students list is ")
    for (index in SortedStudents.indices) {
        println("${SortedStudents[index]}")
    }

}