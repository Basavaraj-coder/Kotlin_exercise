/*data class Check(var Roll:Int,var Percentage:Double){
}*/
/*fun main(Arg:Array<String>)
{
    val obj=Check(21,79.69) //use of data class using data class we can compare values of OBjects like In java equals()
    var obj1=Check(21,79.69)
    var a:Int=if(obj==obj1) 1 else return
    println(a)
    println("$obj \t $obj1") //using data class printing objects holding values like java's toString()
    val obj2=obj1.copy() //copying values using copy() by Data class
    println(obj2)
}
 */
class Check{
    var roll:Int=102
     companion object{    //use of object class , by using object keyword a class will get instantiated only once in whole application
        var roll:Int=0    // use of companion object
    }
}

fun main(Arg:Array<String>) // in kotlin unlike java Static keyword is not Available, So here work of static keyword is done by object keyword
{
    var obj1=Check()
    println("${obj1.roll}")
    Check.roll=10 // automatically object is created by compiler only once and calling of properties and methos is done by className.propertyName or methodName
    Check.roll=20
    println("${Check.roll}")

}