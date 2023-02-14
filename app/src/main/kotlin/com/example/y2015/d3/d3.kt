package com.example.y2015.d3

import com.example.y2015.core.FileReader

fun main(){
    val symbolString = FileReader().readString("/com/example/y2015/d3.txt")
    val uniqueHousesVisited = DeliveryTracker().getNumberOfHouses(symbolString,false)

    println(uniqueHousesVisited)

}