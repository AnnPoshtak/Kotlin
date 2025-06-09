fun main(){
    print("Скільки зірочок ви хочете: ")
    val s = readLine()!!
    val star = s.toInt()
    for (i in 1..star){
        print("*")
    }
}