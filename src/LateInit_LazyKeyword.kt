import kotlin.math.* //import package
fun main(arg:Array<String>)
{
    val pi:Double by lazy { 3.14 }
    lateinit var name:String

    println("Enter figure or Shape name which you want to calculate area ?")
    name=readLine()!!.toString()
    println(name)
    println(Area(pi,name))
}
fun Area( pi:Double,name:String):Int
{
    var len:Int
    var bred:Int
    var radius:Int

    val area:Int=when(name){
        "rectangle"-> {
            println("Enter len And bred of rectangle")
            len= readLine()!!.toInt()
            bred= readLine()!!.toInt()
            len*bred
        }
        "circle","Circle"->{
            println("Enter radius of circle")
            radius= readLine()!!.toInt()
            (pi*radius*radius).roundToInt()
        }
        "triangle","Triangle"->{
            println("Enter bred and len of triangle")
            bred= readLine()!!.toInt()
            len = readLine()!!.toInt()
            1/2*bred*len
        }
        else->0
    }
    return area
}
