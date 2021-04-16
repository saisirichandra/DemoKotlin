package classes.functions

class Lambda {
}

@OptIn(ExperimentalStdlibApi::class)
fun main(args: Array<String>) {
    val upperCase :(String)->(String)={ str:String->str.uppercase()}
    val upperCase2 :(String)->(String)={ str->str.uppercase()}
    val upperCase3 ={ str:String->str.uppercase()}
    val upperCase4:(String)->(String)={it.uppercase()}
    val upperCase5:(String)->(String)=String::uppercase
    println(upperCase("siri"))
    println(upperCase2("siri"))
    println(upperCase3("siri"))
    println(upperCase4("siri"))
    println(upperCase5("siri"))


}