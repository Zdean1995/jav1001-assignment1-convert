/*
Name: Zachary Dean
Student Number: A00275392
Class: JAV1001
Description:    This is a distance conversion program that takes in a number, input unit type, and output unit type
                and converts the number to the unit chosen and outputs it.


*/

fun main() {
    //the distance the user inputs
    var distanceInput = 0.0
    //the distance the program outputs
    var distanceOutput = 0.0
    //the unit type of the input distance
    var inputUnitType = ""
    //the unit type of the output distance
    var outputUnitType = ""
    //the users selection of if they want to convert another number
    var continueInput = "y"
    //the boolean that determines if the program loops
    var continueConversion = true

    //prints out the program name so the user knows what it is.
    println("Distance Converter")
    while(continueConversion) {
        //take a number from the user. Hopefully we're not supposed to do any error catching because this is where
        //the first errors can arise
        println("Please enter the number you wish to convert:")
        distanceInput = readln().toDouble()

        //takes a unit type from the user for the input variable. See second sentence of the last comment
        println("Please enter the unit of the number you entered")
        println("(mm, cm, m, km, in, ft, yd, mi)")
        inputUnitType = readln()

        //takes a unit type from the user for the output variable
        println("Please enter the unit that you want to convert it to")
        println("(mm, cm, m, km, in, ft, yd, mi)")
        outputUnitType = readln()

        //sets the output number to the input number times the conversion ratio
        distanceOutput = distanceInput * (getUnit(inputUnitType) / getUnit(outputUnitType))

        //outputs a string
        println("$distanceInput$inputUnitType is equal to $distanceOutput$outputUnitType")

        //asks the user if they want to convert again using y or n but secretly defaults to yes
        println("Continue? (y/n)")
        continueInput = readln()
        if(continueInput == "n"){
            continueConversion = false
        }
    }
}

//a function to convert the string unit type to the appropriate number to save me having to write it twice
fun getUnit (unit: String): Double {
    return when (unit){
        "mm" -> 1.0
        "cm" -> 10.0
        "m" -> 1000.0
        "km" -> 1000000.0
        "in" -> 25.4
        "ft" -> 304.8
        "yd" -> 914.4
        "mi" -> 1609344.0
        else -> 1.0
    }
}