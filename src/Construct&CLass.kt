class Car(var carName:String,var carColor:String,var carBook:String){ //IF primary construct is declared than there field variable can be declared as using val or val in Primary CONS and no need to declare again in class
    var fuelType:String?=null
    var Name:String?=null
   /* init {
        if(this.carBook.equals("book",true)) { init block is for Initialization of properties
            println("car number-- ${crNo}, carName ${carName}, carColor ${carColor} Is Booked By Basavaraj Hiremath")
        }
    }*/
    constructor(Name:String,fT:String,cname:String,cC:String,cB:String):this(cname,cC,cB) // Secondary constructor
    {       // 1 -> While calling second Constructr in kotlin u should call primary constructr
        fuelType=fT
    }
    fun showed()
    {
        if(this.carBook.equals("book",true)) {
            println("carName ${carName}, carColor ${carColor}, Fuel Type is ${fuelType}, Booked By Basavaraj Hiremath")
        }
        else
        {
            println("Not Booked yet.. Please Book car @ best Offers and Discounts")
        }
    }
}
fun main(arg:Array<String>){
    println("Enter car's fuel type")
    var ft= readLine()!!.toString()
    //println("Enter ")
    //var carnum= readLine()!!.toString()
    println("Enter ur carname")
    var carName= readLine()!!.toString()
    println("Enter carColor")
    var carColor=readLine()!!.toString()
    println("IS ur car booked or Not")
    var carBook=readLine()!!.toString()
    println("Enter ur name")
    var Name= readLine()!!.toString()

    // obj creation of car
    var obj=Car(Name,ft,carName,carColor,carBook)
    obj.showed()
}