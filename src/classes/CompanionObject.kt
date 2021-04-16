package classes

class CompanionObject {
    var data =" Data01"
    companion object Media{
        var data="Company Data"
    }
}

fun main(args: Array<String>) {
    var companionObject = CompanionObject.data
    println(companionObject)

}