package com.example.lib

class Tshirt(name: String, price: Int, quantity: Int): Product(name, price, quantity) {
    fun identify(){
        identifyProductCategory()
    }
}