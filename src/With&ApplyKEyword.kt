class TV
{
    var Brand=""
    var Size=""
    fun startSystem()
    {
        println("Welcome Your Application Error free")
    }
}
fun main(Arg:Array<String>)
{
    val Tvobj=TV()
    with(Tvobj){
        Brand="Sony"
        Size="49inch"
    } // This
    //or
    // This
    Tvobj.apply { Brand="Videocon" //but with APPLY keyword we can cll methods of class but not with 'With keyword'
        Size="59 inch"
    }.startSystem()
    //---------------------
    println("Brand Name - ${Tvobj.Brand } \t Size - ${Tvobj.Size}")
}