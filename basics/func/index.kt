

fun loopFunc (a: Int = 20){
    for (i in 1..a step 3) {
        println(i)
    }
}


public fun checkPrime( n : Int) : Boolean{
    if(n< 2){
        return false
    }else{
        if(n%2==0){
            return false
        }
    return true
    }
    
}



fun main (){
   val res =  checkPrime(4)

   println(res)
    // loopFunc();
}