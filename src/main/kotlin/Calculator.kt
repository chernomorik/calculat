fun main(){
    var result:Int = 0
    println("Введите первое число")
    var a:Double = readLine()!!.toDouble()
    println("Введите второе число")
    var b:Double = readLine()!!.toDouble()
    println("Выберите операцию")
    println("1 - сумма")
    println("2 - разность")
    println("3 - произведение")
    println("4 - частность")
    var choose:Int = readLine()!!.toInt()
    if (choose==1)
    {
        result = (a + b).toInt()
        println("Сумма равна:")
        println(result)
    }
    if (choose==2)
    {
        result = (a - b).toInt()
        println("Разность равна:")
        println(result)
    }
    if (choose==3)
    {
        result = (a * b).toInt()
        println(" Произведение равно:")
        println(result)
    }
    if (choose==4)
    {
        result = (a / b).toInt()
        println("Частность равна:")
        println(result)
    }
}
