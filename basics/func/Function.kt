
 fun num(a: Int, b: Int) : Int{
    return a + b;
 }


public fun isPrime( a : Int) : Boolean{
    if(a <= 1){
        return false
    }
    var i = 2;
    while(i < a){
        if(a%i==0){
            return false
        }
        ++i
    }
    return true
 }

fun main() {
  
 
}