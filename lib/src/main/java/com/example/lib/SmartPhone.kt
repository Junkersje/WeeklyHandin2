package com.example.lib

class SmartPhone(brand: String, storageCapacity: Int, price: Float, var batteryPercentage: Int): Computer(brand, storageCapacity, price) {
    fun dialNumber(number: Int){
        println("$brand smartphone is dialing number: $number")
    }
}