fun main(){
    println("Введи номери шкіл по одному")
    var schools = mutableListOf(0,0,0,0,0,0,0,0,0,0)
    for (i in 0..9) {
        print("Школа номер ${i + 1}: ")
        var num = readLine()!!
        schools[i] = num.toInt()
    }
    print("Тепер введи номер своєї шкoли: ")
    val my = readLine()!!
    val mySchool = my.toInt()
    var j = 10
    for (i in 0..9){
        if (schools[i]==mySchool){
            j = 10
            break
        }else{
            j = 5
        }
    }
    if (j==10){
        println("Я знаю твю школу")
    }else{
        println("Я не знаю вашу школу")
    }
}