fun main(){
    print("First: ")
    val f = readLine()!!
    print("Second: ")
    val s = readLine()!!
    print("Third: ")
    val t = readLine()!!

    var first = f.toInt()
    var second = s.toInt()
    var third = t.toInt()

    if (third == 1){
        println("${first+second}")

    }else if (third == 2){
        println("${first-second}")
    }else if(third==3){
        println("${first/second}")
    }
}