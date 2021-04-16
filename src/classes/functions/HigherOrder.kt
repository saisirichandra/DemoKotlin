package classes.functions

class HigherOrder {
}

    fun sum(a: Int, c: Int): Int {
        return a + c
    }

    fun square(a:Int):Int = a*a

    fun funReturningAnotherFun(): (Int) -> Int {
        return ::square
    }
    fun mul(a: Int, c: Int): Int = a * c

    fun calculate(a: Int, c: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, c)
    }

    fun main() {
        val resultSum = calculate(2, 3, ::sum)
        val resultMul = calculate (20, 30, ::mul)
        val resultSquare=funReturningAnotherFun()
        println(resultMul)
        println(resultSum)
        println(resultSquare(20))
    }
