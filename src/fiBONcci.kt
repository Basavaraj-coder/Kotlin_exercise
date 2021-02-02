fun main(arg:Array<String>)
{
    print("Enter a number to find fibonacci series\n")
    var read= readLine()!!.toInt()
    getFibonacci(read)

                                                                                                 /*  if(i == 1)
                                                                                                  {
                                                                                                        fib = 0
                                                                                                        print(fib)
                                                                                                    }
                                                                                                    else if( i == 2)
                                                                                                    {
                                                                                                        print("${fib+1}")
                                                                                                    }
                                                                                                    else {
                                                                                                        fib = num1 + num2
                                                                                                        print(fib)
                                                                                                        num1 = num2
                                                                                                        num2 = fib*/
}
fun getFibonacci(read:Int)
{
    var n1=0
    var n2=1
    var i=1
    var fib=0
    println("Fibonacci series\n")
    while(i <= read)
    {
        if(i == 1)
            print(n1)
        else if(i == 2)
           print(n2)
        else
        {
            fib=n1+n2
            n1=n2
            n2=fib
            print(fib)
        }
        i++
    }
}