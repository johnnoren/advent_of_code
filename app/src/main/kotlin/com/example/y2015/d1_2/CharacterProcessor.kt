package com.example.y2015.d1_2

// Inspired by https://github.com/jvgrootveld/advent-of-code/blob/main/2015/src/main/kotlin/day01/Day01.kt
class CharacterProcessor {

    fun getFloor(symbolString: String) : Int {
        val upCount = symbolString.count { it == '(' }
        val downCount = symbolString.count { it == ')' }
        return upCount - downCount
    }

    fun getBasementCharacterPosition(symbolString: String): Int {
        var charPosition = 1
        var currentFloor = 0

        for (char in symbolString) {
            when(char) {
                '(' -> currentFloor++
                ')' -> currentFloor--
            }

            if (currentFloor < 0) break;

            charPosition++

        }

        return charPosition
    }
}
