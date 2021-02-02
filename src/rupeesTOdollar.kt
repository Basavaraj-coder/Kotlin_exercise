fun main(args:Array<String>)
{
    println("*********************Rupees Convertor*****************************")
    println("Please Enter Digits ")
    var In= readLine()!!.toDouble()
    println("Input Currency in Which you want to convert ")
    var Converter= readLine()!!.toString()
    when(Converter)
    {
        "dollar","Dollar"->{ println("Conversion of US Dollars To RS  ${In/73.80}") }
        "Euro","euro"->{ println("Conversion of Euro To Rupees  ${In/89.47.toDouble()}") }
        "pound","Pound"->{ println("Conversion of Pound to Rs  ${In/99.18.toDouble()}") }
        "dirham","Dirham"->{ println("Conversion of Dirham to Rs  ${In/20.09.toDouble()}") }
        "dinar","Dinar"->{ println("Conversion of BahrainiDinar TO Rupee  ${In/191.60.toDouble()}") }
        "baht","Baht"->{ println("Conversion of Baht To Rs  ${In/2.226.toDouble()}") }
        else->println("SRRY Currency not available")
    }

}