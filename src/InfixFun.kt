fun main(arg:Array<String>):Unit
{
    var str1:String= readLine()!!.toString()
    var str2:String= readLine()!!.toString()
    println(str1.strCompare(str2))
}
infix fun String.strCompare(str:String):Boolean
{
    if(this.equals(str,true))
    {
      return true
    }
    return false
}