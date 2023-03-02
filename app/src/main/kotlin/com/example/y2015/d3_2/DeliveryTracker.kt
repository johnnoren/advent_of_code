package com.example.y2015.d3_2

import com.example.y2015.core.Position
import java.util.InputMismatchException
import kotlin.system.exitProcess

class DeliveryTracker {

    private fun getAllPositions(directions: String) : List<Position> {
        val positionList = mutableListOf(Position(0,0))
        directions.toList().forEach { positionList.add(getNextPosition(it, positionList.last())) }
        return positionList
    }

    private fun getNextPosition(character: Char, currentPosition: Position) = when (character) {
        '^' -> currentPosition.moveUp()
        'v' -> currentPosition.moveDown()
        '<' -> currentPosition.moveLeft()
        '>' -> currentPosition.moveRight()
        else -> throw InputMismatchException("Invalid character: $character")
    }

    fun getNumberOfHouses(directions: String, splitDirections: Boolean) : Int {
        val directionsBatches = if (splitDirections) splitDirections(directions) else listOf(directions)
        val positions = directionsBatches.flatMap { getAllPositions(it) }
        val uniquePositions = positions.toSet()

        return uniquePositions.size
    }

    // Changed to use partition. Learned about it here:
    // https://github.com/0legg/adventofcode/blob/master/year2015/src/main/kotlin/net/olegg/aoc/year2015/day3/Day3.kt
    private fun splitDirections(directions: String) : List<String> {
        return directions
            .toList()
            .withIndex()
            .partition { it.index % 2 == 0 }
            .toList()
            .map { it.joinToString("") { indexedValue -> indexedValue.value.toString() } }

    }

}
