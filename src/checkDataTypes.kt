fun main(arg:Array<String>)
{
    var a:Byte=13 // for byte u have to specify datatype else compiler will consider as Integer
    println("${a::class.java}")
    var b=128
    println(b::class.java)
    var c=12.3122324241
    println(c::class.java)
}