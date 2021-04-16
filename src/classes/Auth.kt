package classes

object Auth {
    fun takeCredientals(login: String,password: String){
        println("logging as $login with password $password")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        Auth.takeCredientals("Chandra","Null")
    }
}