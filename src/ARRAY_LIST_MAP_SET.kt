fun main(ar:Array<String>)
{
    var arr= Array<Int>(5){0} //intArrayOf(1,2,3,4,5)
    arr.set(0,1)

    for(ele in arr)
    {
        println(ele)
    }
    var list= listOf<Int>(1,2,3,4) //immutable
    println(list.size)
    for(li in list)
    {
        println(li)
    }
    var li2= mutableListOf<Char>('1','2','3') //mutable list
    li2[2]='b'
    for(l in li2)
        println(l)

    var map= mapOf<String,String>("basavaraj" to "Hiremath", "Abu" to "Hiremath" ) // immutable
    println(map.get("Abu"))
    for(m in map)
    {
        println(m)
    }
    var mp= mutableMapOf<Int,Char>(1 to 'a',2 to 'b' ) //mutable
    println(mp)

    var s= setOf<Int>(0,1,2,3,4,5,6) // immutable
    for(S in s)
    {
        println(S)
    }
    var set= mutableSetOf<Int>(1,2,3,4,56,67)
    for(s in set)
        println(s)
}