package com.example.lib

open class Computer(val brand: String, val storageCapacity: Int, var price: Float) {
    fun powerOn(){
        println("$brand, is powering up")
    }
    fun powerOff(){
        println("$brand, is powering down")
    }
}
