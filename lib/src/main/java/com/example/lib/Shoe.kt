package com.example.lib

class Shoe(name: String, price: Int, quantity: Int): Product(name, price, quantity) {
    fun identify(){
        identifyProductCategory()
    }
}