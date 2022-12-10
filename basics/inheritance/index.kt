
open class Person( name : String) {
    init {
        println("person name is $name")
    }
}

class Rahim(name: String, age: Int, favSports: String) : Person(name){

    init {
        println("person name is $name")
        println("$name is $age year's old!")
        println("$name favorite sport is $favSports")
    }
}



open class Example(){
    open fun printValue(number : Int){
        println("this number is $number")
    }
}


class ExampleTwo: Example(){

    override fun printValue(number : Int){
        println("this number is" + (number-10))
    }

}



fun main (){
val e1 = Example()
val subE1 = ExampleTwo()
println("Example method call")
e1.printValue(20)

println("ExampleTwo method call")

subE1.printValue(50)

}