

fun main () {
    val number = 10;

    val res : String = when(number){
        1 -> "number is one"
        2 -> "number is two"
        else -> "not matched!!"
    }

    println(res)
}