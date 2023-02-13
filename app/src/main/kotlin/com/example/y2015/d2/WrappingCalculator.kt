package com.example.y2015.d2

class WrappingCalculator {
    fun getSquareFeetNeeded(boxSize: BoxSize) : Int {
        val sidesList = getSides(boxSize)
        val smallestSide = sidesList.min()

        return sidesList.sum() + smallestSide
    }

    private fun getSides(boxSize: BoxSize) : List<Int> {
        val sideTypeA = boxSize.height * boxSize.length
        val sideTypeB = boxSize.height * boxSize.width
        val sideTypeC = boxSize.width * boxSize.length

        return listOf(sideTypeA,sideTypeA,sideTypeB,sideTypeB,sideTypeC,sideTypeC)
    }
}