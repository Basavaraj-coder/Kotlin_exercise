fun main(arg:Array<String>)
{
    var obj=Swapnil()
    obj.Intro()
    obj.Fat()
    println("****************************")
    var obj1=Prabhu()
    obj1.Intro()
    obj1.Fat()
}
open class Nature
{
    fun Fat()
    {
        println("I m Fatty Bitch")
    }
}
class Swapnil:Nature()
{
    fun Intro()
    {
        println("Helloji my name is Swapnil")
    }
}
class Prabhu:Nature()
{
    fun Intro()
    {
        println("Helloji my name is Prabhu")
    }
}
