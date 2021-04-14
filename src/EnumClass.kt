
enum class EnumClass {
    IDLE,CALLING,ANSWERED,RINGING
}

fun main() {
    var state= EnumClass.CALLING
    var message=
        when(state){
            EnumClass.ANSWERED -> "call answered"
            EnumClass.CALLING -> "calling"
            EnumClass.IDLE -> "call in idle state"
            else ->"nothing"

        }
    println(message)
    println(EnumClass.RINGING.ordinal)
}