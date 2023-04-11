fun main() {
    // Assignment 1: Variables and Data Types
    // You are creating an app to capture student records. Some of the data you will
    //capture includes full name, age, phone number, weight in kg and citizen. For the
    //citizen field you will track whether a student is a Kenyan or not.
    //Create variables and assign them some values for each of these fields.
    //This assignment will be graded out of 10 points. Submit a github link.

    val firstName:String = ("Julian")
    val secondName:String=("Mathu")
    val fullName=firstName+secondName
    println(fullName)
    val age:Int= (34 )
    println(age)
    val phoneNumber:String=("0710955698")
    println(phoneNumber)
    val weight = ("weight is ${55.8} kgs" )
    println(weight)
    var citizenship="Kenyan"
   println( citizenship)
    println(names("Ada"))
    println(modulus(168,22))
    println(add(158,300,760,1020))
    factAboutMe()

}
//Assignment 2: Functions
//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
//given “Ada” it will print out “Hello Ada” (2 points)
//Create and invoke a function that given 2 numbers returns the remainder of their
//division (3 points)
//Create and invoke function that returns the sum of any given 4 numbers (3 points)
//Create and invoke a function that prints out an interesting fact about yourself (2
//points)
//Submit a github link.

fun names(name: String):String{
    var name="Hello ${name}"
    return name
}
fun modulus(num:Int,num1:Int):Int{
    var divide=num%num1
    return divide
}
fun add(num:Int,num1: Int,num2: Int,num3: Int):Int{
    var sum=num+num1+num2+num3
    return  sum
}
fun factAboutMe(){
   var fact="I like Solitude"
    println(fact)
}







