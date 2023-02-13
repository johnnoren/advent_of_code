package com.example.y2015.d2

import com.example.y2015.core.FileReader

fun main() {
    val boxSizeList = FileReader().readLines("/com/example/y2015/d2.txt").map { BoxSize.fromString(it) }
    val totalAmountOfPaperNeeded = WrappingCalculator().getSquareFeetNeeded(boxSizeList)
    val totalAmountOfRibbonNeeded = RibbonCalculator().getRibbonLengthNeeded(boxSizeList)

    println(totalAmountOfPaperNeeded)
    println(totalAmountOfRibbonNeeded)

}