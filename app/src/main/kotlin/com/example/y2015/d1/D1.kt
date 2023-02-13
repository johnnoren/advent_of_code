package com.example.y2015.d1

import com.example.y2015.core.FileReader

fun main() {
    val symbolString = FileReader().readString("/com/example/y2015/d1.txt")
    val floorLevel = CharacterProcessor().getFloor(symbolString)
    val basementCharacterPosition = CharacterProcessor().getBasementCharacterPosition(symbolString)

    println(floorLevel)
    println(basementCharacterPosition)

}