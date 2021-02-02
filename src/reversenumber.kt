fun main(Arg:Array<String>)
{
    print("Enter a number to Reverse : \n")
    var num= readLine()!!.toInt()
    var reverse:Int=0
    var rem:Int?
    while(num!=0)
    {
        rem=num%10
        reverse=reverse * 10 + rem
        num/=10
    }
    print("Reversesd integer $reverse")
}