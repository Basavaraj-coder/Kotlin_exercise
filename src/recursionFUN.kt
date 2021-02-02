import java.util.*

fun main(Arg:Array<String>) {
    val out = Scanner(System.`in`)
    val num = out.nextInt()
    println("factorail = " +fact(num))
}
fun fact(num1:Int):Int
{
    return if(num1 == 1) num1.toInt()
    else num1*fact(num1-1)//return if(num1==1) num1.toInt()        // terminate condition
    //else num1*fact(num1-1)
}