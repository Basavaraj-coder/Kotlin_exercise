import java.util.*

fun main(arg:Array<String>)
{
    val input=Scanner(System.`in`)
    val out:Int=input.nextInt()
    println("$out is Roll no")
    //var input1=Scanner(System.`in`)
    val add=input.next()
    println("$add is address")
    val obj = student(out,add)
    obj.display()
}
class student(roll:Int,add:String)
{
    private var roll:Int=0
    private var Add:String?=null
    init {
        this.roll=roll
        this.Add=add
    }
    fun display()=println("$roll is roll number \n $Add is address of student")
}