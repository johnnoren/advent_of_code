package com.example.y2015.d6

import com.example.y2015.core.FileReader

fun main() {
    val instructionStrings = FileReader().readLines("/com/example/y2015/d6.txt")
    val instructionList = LightingInstructionReader().readAll(instructionStrings)
    val lightingGrid = LightingGrid()

    lightingGrid.applyLightingInstruction(instructionList)

    val lightCount1 = lightingGrid.values.flatMap { arr -> arr.toList() }.count { it }
    // val niceCount2 = part2(strings)

    println(lightCount1)
    // println(lightCount2)
}