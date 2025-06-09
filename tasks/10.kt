fun main(){
    var card = mutableListOf<Int>()
    var sum = 0
    for (i in 0..9){
        print("Введіть баланс на карті під номером ${i+1}: ")
        var balance = readLine()!!
        card.add(balance.toInt())
        sum+=balance.toInt()
    }
    println("В сумі на всіх картках:$sum гривень")
}

