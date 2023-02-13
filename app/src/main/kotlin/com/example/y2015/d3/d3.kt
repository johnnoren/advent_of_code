package com.example.y2015.d3

import com.example.y2015.core.FileReader
import com.example.y2015.d1.CharacterProcessor

fun main(){
    val symbolString = FileReader().readString("/com/example/y2015/d3.txt")
    val uniqueHousesVisited = DeliveryTracker().getNumberOfHouses(symbolString,{ it > 1 })

    println(uniqueHousesVisited)

}