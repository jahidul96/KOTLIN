

fun main () {
    val lang = arrayOf("bangla", "eng", "hindi", "japanes")

    println(lang.size)
    println(lang.get(2))
    for (item in lang.indices) {


        if(item%2 ==0){
            println(lang[item])
        }
    }
}