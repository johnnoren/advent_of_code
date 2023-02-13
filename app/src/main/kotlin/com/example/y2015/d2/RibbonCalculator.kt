package com.example.y2015.d2

class RibbonCalculator {
    fun getRibbonLengthNeeded(boxSize: BoxSize): Int {
        val volume = boxSize.length * boxSize.width * boxSize.height
        val dimensionsList = listOf(boxSize.length,boxSize.height,boxSize.width)
        val smallestDimensions = dimensionsList.sorted().subList(0,2)
        val circumference = smallestDimensions.sumOf { it * 2 }

        return volume + circumference
    }

    fun getRibbonLengthNeeded(boxSizeList: List<BoxSize>) : Int {
        return boxSizeList.sumOf { getRibbonLengthNeeded(it) }
    }
}