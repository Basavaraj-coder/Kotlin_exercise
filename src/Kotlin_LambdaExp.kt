val sum1={a:Int,b:Int->a+b}
val str={str1:String,str2:String -> str1+str2} // both are lambda expressions
fun main(arg:Array<String>)
{
     sum1(10,10)
    println("String concat ${str("Basavaraj ","Hiremath")}")
}