fun main(arg:Array<String>)
{
    println("Enter Name")
    val str=readLine()!! // for taking input
    println("Enter ID number")
    val roll= readLine()!!.toInt() //taking input of type Integer
    println("Name is = $str")
    println("Roll no is $roll")
    var a=123
    var b:Boolean=if(roll == a) true else false//Holding boolean value and use of IF as expression
    print("$b")
    println("Basavaraj");print("Hiremath") //printing multiple statement in one line by using semicolon
}