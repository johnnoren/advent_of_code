package com.example.y2015.d3

import com.example.y2015.core.FileReader

fun main(){
    val symbolString = FileReader().readString("/com/example/y2015/d3.txt")
    val uniqueHousesVisitedBySanta = DeliveryTracker().getNumberOfHouses(symbolString,false)
    val uniqueHousesVisitedBySantaAndRobot = DeliveryTracker().getNumberOfHouses(symbolString,true)

    println(uniqueHousesVisitedBySanta)
    println(uniqueHousesVisitedBySantaAndRobot)

}