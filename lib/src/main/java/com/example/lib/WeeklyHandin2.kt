package com.example.lib

fun main() {

    //opgave1()
    //opgave2()
    //opgave3()
    opgave4()

}

fun opgave1(){
    val employee1: Employee = Employee("Simon", "Eriksen")
    val employee2: Employee = Employee("Bizz", "Bass")

    println(employee1.getYearlySalary())
    println(employee2.getYearlySalary())
    employee1.giveRaise(10)
    employee2.giveRaise(10)
    println(employee1.getYearlySalary())
    println(employee2.getYearlySalary())

}
fun opgave2(){

}
fun opgave3(){
    val shoe1: Shoe = Shoe("Shoe", 100, 2)
    shoe1.identify()
    val tshirt1: Tshirt = Tshirt("T-shirt", 150, 1)
    tshirt1.identify()
    val book1: Book = Book("Book", 250, 1)
    book1.identify()
}
fun opgave4(){
    // Junior solution
    println("Junior solution \n ")
    val circleJunior = CircleJunior(5.0, "Red", false)
    println("Circle area: ${circleJunior.calculateArea()}")
    println("Circle perimeter: ${circleJunior.calculatePerimeter()}")

    val triangleJunior = TriangleJunior(3.0, 4.0, 5.0, "Blue", true)
    println("Triangle area: ${triangleJunior.calculateArea()}")
    println("Triangle perimeter: ${triangleJunior.calculatePerimeter()}")

    //Senior solution
    /*
    * I Senior løsningen bliver der brugt sealed for classen, som jeg ikke helt forstår funktionen af.
    * Kan godt lide mængden af forklarende kommentarer, hvilket giver mening i en arbejdsmessig sammenhæng
    * Der er en validering i init constructoeren som jeg egentlig synes er ret genialt.
    * På trods af at junior har en smule redundant kodei forhold til senior er det ellers meget ens løsninger jeg blev præseneret
    * Jeg er mest fan af senior løsningen*/
    println("\n Senior solution: \n ")
    val circleSenior = CircleSenior(radius = 5.0, color = "Red", isTransparent = false)
    println("Circle area: ${circleSenior.calculateArea()}")
    println("Circle perimeter: ${circleSenior.calculatePerimeter()}")

    val triangleSenior = TriangleSenior(3.0, 4.0, 5.0, color = "Blue", isTransparent = true)
    println("Triangle area: ${triangleSenior.calculateArea()}")
    println("Triangle perimeter: ${triangleSenior.calculatePerimeter()}")

}