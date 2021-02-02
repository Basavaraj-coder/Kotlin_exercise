//import java.util.*

import java.time.LocalDate

val StringD1:String by lazy { "2021-01-01" }

fun main(Ar:Array<String>) {
    var happynewyear=Happy_new_year()
    happynewyear.check()
}
class Happy_new_year{
    var date = LocalDate.now()
    var stringD:String=date.toString()
    fun check()
    {
        if(StringD1.equals(stringD,true))
        {
            println(stringD)
            println("****** Happy New Year ******* ")
            println("May everybody's this year should come with full of happiness and may your Dream comes True")
        }
        else { println(stringD)
            println("Sorry still u have to wait for new year ")
            return
        }
    }
}