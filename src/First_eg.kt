fun main(arg:Array<String>)
{
    println(varar(10,20,30,40,50))
}
fun varar(vararg d:Int)=d.sum() //vararg all data is contained in d variable of basic dataType also assign the value to function which it returns by using =