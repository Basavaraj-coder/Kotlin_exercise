import kotlin.math.pow

fun power(var1:Double, var2:Double):Double
{
    return var1.pow(var2)  //pow method is only for Double dataType
}
fun add(var1:Double,var2:Double,var3:Double):Double // fn overloading
{
    return var1+var2+var3
}
fun add( str1:String,str2:String):String
{
    return str1+str2
}
fun main(arg:Array<String>)
{
    val call=::power // store function in variable
    println(call(2.0,3.0))// calling of fun with the help of variable
    val addCall=add(1.1,2.2,2.1) //FUN OVERLOAD
    println(addCall)

    for(i:Int in 0.rangeTo(3)) // use of RangeTo()
        println(i)
}