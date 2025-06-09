fun main() {
    var sizes = mutableListOf<Int>()
    var maxNum = 0
     for(i in 0..9){
         print("Введіть будь-яке не парне число. 0 - це кінець: ")
         sizes.add(readLine()!!.toInt())
         if (sizes[i]==0){
             break
         }
         if (sizes[i]>maxNum){
             maxNum = sizes[i]
         }
     }
    for (i in 0..sizes.size-1){
        var pr = " ".repeat((maxNum-sizes[i])/2)
        var star = "*".repeat(sizes[i])
        println("$pr$star")
    }
}