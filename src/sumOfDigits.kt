fun main(arg:Array<String>)
{
    print("Enter number to calculate its sum")
    var read= readLine()!!.toInt()
    var sum1=0.0
    while(read != 0)
    {
        var rem=read % 10
        sum1+=rem
        read/=10
    }
    print("Sum of digits : is ${sum1/2}")
}