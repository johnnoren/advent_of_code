package com.example.y2015.d3

import java.util.InputMismatchException

class DeliveryTracker {
    fun getNumberOfHouses(directions: String, criteria: (Int) -> Boolean): Int {
        val positionList = getPositionsFromDirections(directions)
        val uniqueHouses = positionList.toSet()

        return uniqueHouses.size
    }

    private fun getPositionsFromDirections(directions: String) : List<Position> {
        var currentPosition = Position(0,0)
        val positionList = mutableListOf(currentPosition)

        directions.toList().forEach {
            currentPosition = when(it){
                '^' -> currentPosition.moveUp()
                'v' -> currentPosition.moveDown()
                '<' -> currentPosition.moveLeft()
                '>' -> currentPosition.moveRight()
                else -> throw InputMismatchException()
            }
        positionList.add(currentPosition)
        }
        return positionList
    }

}
