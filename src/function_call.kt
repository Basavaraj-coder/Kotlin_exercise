import java.util.*

fun main(arg:Array<String>)
{
    val num1= Scanner(System.`in`)
    val num2=num1.nextInt()
    val num3=num1.nextInt()
    println(mul(num2,num3))
    //println(str(num1,'abc'))// gives type mismatch ,compilation error
}
fun mul(a:Int,b:Int):Int
{
    return a*b
}
/*fun str(str1:String,num1:Int)
{
    println("hii")
}*/