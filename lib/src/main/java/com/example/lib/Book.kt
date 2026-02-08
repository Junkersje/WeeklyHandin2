package com.example.lib

class Book(name: String, price: Int, quantity: Int): Product(name, price, quantity) {
    fun identify(){
        identifyProductCategory()
    }
}