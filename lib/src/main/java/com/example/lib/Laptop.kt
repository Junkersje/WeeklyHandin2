package com.example.lib

class Laptop(brand: String, storageCapacity: Int, price: Float, val hasKeyboardLight: Boolean) : Computer(brand, storageCapacity, price) {
    private var screenOpen: Boolean = false
    fun liftScreen(){
        if(screenOpen){
            println("$brand laptop screen lifted opened")
            screenOpen=true
        } else {
            println("$brand laptop screen lifted closed")
            screenOpen=false
        }
    }
}