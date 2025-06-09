fun main(){
    print("Введіть число: ")
    val n = readLine()!!
    val number = n.toInt()
    for (i in 1..number){
        print("$i"+",")
    }
}