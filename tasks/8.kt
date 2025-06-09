fun main(){
    print("Введіть розмір ялинки: ")
    val s = readLine()!!
    val size = s.toInt()
    var star = ""
    var space=""
    for (i in 1..size){
        star=""
        space=""
        for(s in 1..size-i){
            space+=" "
        }
        for(st in 1..i*2-1){
            star+="*"
        }
        println(space+star)
    }
    var space1=""
    for(i in 1..size-1){
        space1+=" "
    }
    println(space1+"*")
}