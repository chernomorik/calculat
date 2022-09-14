fun main(){
    var result:Int = 0
    println("Введите первое число")
    var a:Int = readLine()!!.toInt()
    println("Введите второе число")
    var b:Int = readLine()!!.toInt()
    println("Выберите операцию")
    println("1 - сумма")
    println("2 - разность")
    var choose:Int = readLine()!!.toInt()
    if (choose==1)
    {
        result = a + b
        println("Сумма равна:")
        println(result)
    }
    if (choose==2)
    {
        result = a - b
        println("Разность равна:")
        println(result)
    }
}