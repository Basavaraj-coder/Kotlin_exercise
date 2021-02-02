fun main(arg:Array<String>)
{
    println("your GOOD Name here")
    var Name= readLine()!!.toString()
    println("Do u wear mask YES/No")
    var WearMask= readLine()!!.toString()
    println("Do u Keep Social Distancing Yes/No")
    var KeepSocial_Distance= readLine()!!.toString()
    println("Do u Sanitize urself yes/no")
    var Sanitize= readLine()!!.toString()
    println("U Do Daily Anulom_Vilom yes/no")
    var Doanulom_vilom= readLine()!!.toString()
    Beatcorona(Name,WearMask,KeepSocial_Distance,Sanitize,Doanulom_vilom)
}
fun Beatcorona(Name:String,WearMask:String,KeepSocial_Distance:String,Sanitize:String,Doanulom_vilom:String)
{
    if((WearMask.equals("yes",true)) && (KeepSocial_Distance.equals("yes",true)) && (Sanitize.equals("yes",true)) && (Doanulom_vilom.equals("yes",true)))
    {
        println("********** Covid-Test ****************")
        println("yahoooo..")
        print("${Name} YOU ARE SAFE")
        println("****************************")
    }
    else
    {
        println("You r Not Safe ${Name} Bomblat bssss..")
    }
}
