fun main(arg:Array<String>)
{
    val obj1=Swapnali()
    obj1.Body_Nature()

    println("********************************")
    val obj2=Prabha()
    obj2.Body_Nature()
}
open class HOMOSAPIENS
{
    open var Color="Transprent"
    open fun Body_Nature()
    {
        println("Ok,Human is Normal")
        println("And my color type is  $Color")
    }
}
class Swapnali:HOMOSAPIENS()
{
    val name="Swapnali Adgale"
    override var Color="Ismail_koyla"
    override fun Body_Nature()
    {
        println("Hi.. I m $name ,I m Fat in Body Type & Slut in Nature")
        println("And My Color Type is  $Color")
    }
}
class Prabha:HOMOSAPIENS()
{
    val name="Prabha Dhobale"
    override var Color="Gora_chitti_rand"
    override fun Body_Nature() {
        //super.Body_Nature()
        println("Hi..my name is $name, I m Same like Swapnali but i have additional character Bumbarding bOOmb Everywhere")
        println("And my color type is  $Color")
    }
}
