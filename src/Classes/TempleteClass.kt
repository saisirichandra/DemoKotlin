package Classes

import kotlin.random.Random

object  TempleteClass {
    fun getNumber(){
        var num= java.util.Random()
        println(num.nextInt(20))
    }
}

fun main() {
    var t1=TempleteClass.getNumber()
    var t2=TempleteClass.getNumber()

}