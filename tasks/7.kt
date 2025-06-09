fun main(){
    print("Введи розмір трикутика: ")
    val s = readLine()!!
    val size = s.toInt()

    var star = ""
    for(i in 1..size){
        star+="*"
        println(star)
    }
}