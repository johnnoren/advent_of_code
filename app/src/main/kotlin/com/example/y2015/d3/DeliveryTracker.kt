package com.example.y2015.d3

import java.util.InputMismatchException

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

    private fun splitDirections(directions: String) : List<String> {
        val even: (Int) -> Boolean = { it % 2 == 0 }
        val odd: (Int) -> Boolean = { it % 2 == 1 }
        val directionsString1 = directions.toList().filterIndexed { index, _ -> even(index) }.joinToString("")
        val directionsString2 = directions.toList().filterIndexed { index, _ -> odd(index) }.joinToString("")

        return listOf(directionsString1,directionsString2)
    }

}
