fun main(){
    print("Якого розміру квадрат ви хочете: ")
    val s = readLine()!!
    val size = s.toInt()
    var star = ""
    for (i in 0..size-1){
        star+="*"
    }
    for (i in 0..size-1){
        println("$star")
    }
}