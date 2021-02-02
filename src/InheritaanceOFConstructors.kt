open class Animal(var legs:String)
{
    init{println( if(legs.equals("4",true)) true else false)}
  /*  constructor(legs:String)
    {
        if(legs.equals("4",true))
        {
            this.legs=legs
            println("4 legged animal ")
        }
        else
        {
           return
        }

    }*/
}
class Dog:Animal
{
    var breed=""
    var color=""
    constructor(breed:String,color:String,legs:String):super(legs)
    {
        this.breed=breed
        this.color=color
        println("Breed is ${this.breed} ANd color is ${this.color}")
    }

}
fun main(arg:Array<String>)
{
    val dog=Dog("labro","pink","4")
}