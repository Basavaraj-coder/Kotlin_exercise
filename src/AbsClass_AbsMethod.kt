abstract open class abs
{
    abstract fun Human()
}
class girl:abs()
{
    override fun Human()
    {
        println("Hii i m Human but Also I m girl")
    }
}
class boy:abs()
{
    override fun Human()
    {
        println("Hii i m human but also I m boy")
    }
}
fun main(arg:Array<String>)
{
    val obj=boy()
    obj.Human()
}