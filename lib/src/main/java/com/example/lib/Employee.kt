package com.example.lib

class Employee(val firstName: String = "Unassigned", val lastName: String = "Unassigned"){
    var monthlySalary: Float = 25000.0F
    init {
        println("Salary given to created Employee: ''$firstName $lastName'' is default of: $monthlySalary")
    }
    fun giveRaise(percentRaise: Int){
        val newSalary: Float = 1 + (percentRaise / 100.0F)
        monthlySalary *= newSalary
        println("Raise given and salary is now: $monthlySalary")
    }
    val getYearlySalary: () -> Float = {
        monthlySalary * 12
    }

    override fun toString(): String {
        return "Employee(firstName='$firstName', lastName='$lastName', monthlySalary=$monthlySalary)"
    }
}