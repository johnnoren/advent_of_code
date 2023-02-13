package com.example.y2015.d1

import com.example.y2015.core.FileReader
import java.lang.IllegalArgumentException

class D1() {

    fun getFloor(symbolString: String): Int {
        var currentFloor = 0

        symbolString.toList().forEach {
            currentFloor = processCharacter(it, currentFloor)
        }
        return currentFloor
    }

    private fun processCharacter(it: Char, currentFloor: Int) : Int {
        return when (it) {
            '(' -> currentFloor + 1
            ')' -> currentFloor - 1
            else -> throw IllegalArgumentException("Invalid character: $it")
        }
    }

    fun getBasementCharacterPosition(symbolString: String): Int {
        var currentFloor = 0
        val isBasement: (Int) -> Boolean = { it == -1 }
        val characterPositionFromIndex: (Int) -> Int = { it + 1 }

        symbolString.toList().forEachIndexed { index, character ->
            currentFloor = processCharacter(character, currentFloor)
            if (isBasement(currentFloor)) return characterPositionFromIndex(index)
        }
        return 0
    }

}

fun main() {
    val symbolString = FileReader().readString("/com/example/y2015/d1.txt")
    val d1 = D1()

    println(d1.getFloor(symbolString))

    println(d1.getBasementCharacterPosition(symbolString))

}