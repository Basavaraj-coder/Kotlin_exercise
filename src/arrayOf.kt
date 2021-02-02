fun main()
{
    var arr=arrayOf(1,2,3,4)
    for(i:Int in 0 until arr.size)
    {
        println(arr[i])
    }

    println("**************************************")
    val arr2=Array(3,{i -> i*1}) //array size is 3 and it initializes from 0,1,2
    for(i in 0 until arr2.size)
    {
        println(arr2.set(i,i+1))
        println(arr2.get(i))
    }

    println(" \n ${arr2[0]}")

    val str1="hello"
    println("${str1.compareTo("hi")}") // String compare can be done also this way

}