interface Myaction
{
    fun OnClick()
   fun Voicelisten()
    {
        println("Hii welcome")
    }
}
interface ThingsTODo
{
    fun ClickButton()
    fun Voicelisten()
    {
        println("What's ur Name")
    }
}
class Dothings:Myaction,ThingsTODo
{
    override fun OnClick() {
        println("U have clicked Start Button")
    }

    override fun ClickButton() {
        this.OnClick()
        println("Please wait System is Starting ....")
        println("System Is Started")
    }

    override fun Voicelisten() {
        super<Myaction>.Voicelisten()
        println("Hurrr")
    }
}
fun main(arg:Array<String>)
{
    println("Please Select what Operations you want to do ?")
    println("1- 'StartButton'")
    println("2- 'VoiceListener'")
    var value= readLine()!!.toInt()
    val obj1=Dothings()
    when(value)
    {
        1-> obj1.ClickButton()
        2-> obj1.Voicelisten()
        else-> println("Wrong choice.. Invalid choice")
    }
}