class WhenThen {
}

fun main() {
    //println(describe(123))
    //xprint(describe("hello"))
    print(NumRange(12))

}
fun describe(obj:Any):String {
    return when (obj) {
        1 -> "one"
        "hello" -> "Greeting"
        is Long -> "Long number"
        !is Int -> "not an integer"
        else -> "Unknown"
    }
}
    fun NumRange(value:Int):String{
      return when (value) {
          in 1..99 -> "Number $value is below 100"
          in 100..999 -> "Number $value is above 100 and below 1000"
          !in 1000..9999 -> "Number $value is above 1000 and below 10000"
          else -> "number above 10000"
      }
    }
