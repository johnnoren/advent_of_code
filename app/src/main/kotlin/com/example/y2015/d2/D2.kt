package com.example.y2015.d2

import com.example.y2015.core.FileReader

fun main() {
    val calculator = WrappingCalculator()
    val boxSizes = FileReader().readLines("/com/example/y2015/d2.txt").map { BoxSize.fromString(it) }
    val totalAmountOfPaperNeeded = boxSizes.sumOf { calculator.getSquareFeetNeeded(it) }

    println(totalAmountOfPaperNeeded)

}