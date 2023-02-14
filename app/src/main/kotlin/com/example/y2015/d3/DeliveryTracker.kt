package com.example.y2015.d3

import java.util.InputMismatchException

class DeliveryTracker {
    fun getNumberOfHouses(directions: String, splitDirections: Boolean): Int {
        return if (splitDirections) getNumberOfHousesFromTwoCouriers(directions) else getNumberOfHousesFromOneCourier(directions)
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
                else -> throw InputMismatchException("Invalid character: $it")
            }
        positionList.add(currentPosition)
        }
        return positionList
    }

    private fun getNumberOfHousesFromOneCourier(directions: String) : Int {
        val positionList = getPositionsFromDirections(directions)
        val uniqueHouses = positionList.toSet()

        return uniqueHouses.size
    }

    private fun getNumberOfHousesFromTwoCouriers(directions: String) : Int {
        val splitDirections = splitDirections(directions)
        val courier1Positions = getPositionsFromDirections(splitDirections.first)
        val courier2Positions = getPositionsFromDirections(splitDirections.second)
        val mergedPositionList = courier1Positions + courier2Positions
        val uniqueHouses = mergedPositionList.toSet()

        return uniqueHouses.size
    }

    private fun splitDirections(directions: String) : Pair<String,String> {
        val even: (Int) -> Boolean = { it % 2 == 0 }
        val odd: (Int) -> Boolean = { it % 2 == 1 }
        val directionsString1 = directions.toList().filterIndexed { index, _ -> even(index) }.joinToString("")
        val directionsString2 = directions.toList().filterIndexed { index, _ -> odd(index) }.joinToString("")
        println(directionsString1)

        return Pair(directionsString1,directionsString2)
    }

}
