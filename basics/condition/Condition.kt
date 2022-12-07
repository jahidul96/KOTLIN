

fun main () {

    // val a: Int = 5;
    // val b: Int = 2;

    // if( a > b ){
    //     println("$a is greater then $b !!!")
    // }else {
    //     println("$b is greater than $a !")
    // }

    println("enter a number ")
    val inputVal = readLine();
    

   val result  = when(inputVal) {
        "5" -> "5 is printed"
        "2" -> "2 is printed"
        else -> "none of the value matched!!"
    }

    println(result);

}