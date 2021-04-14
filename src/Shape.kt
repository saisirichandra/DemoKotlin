class Shape(var lenght:Int,var breadth:Int) {
    var perimeter =(lenght+breadth)*2
}

fun main() {
    var result =Shape(5,4)
    println("Perimeter of Rectangle is ${result.perimeter}")
}