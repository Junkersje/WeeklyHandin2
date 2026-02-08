package com.example.lib

open class Product(val name: String, var price: Int, var quantity: Int) {
    protected fun identifyProductCategory(){
        println("I am a $name")
    }
}