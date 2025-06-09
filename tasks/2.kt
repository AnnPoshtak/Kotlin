fun main(){
    print("Яка у вас зарплатння: ")
    val z = readLine()!!
    val zp = z.toInt()
    if (zp>1000000){
        println("Міліонер")
    } else if (zp<=1000000 && zp>1000){
        println("Ну нормально")
    } else {
        println("Ти бідний!")
    }
}