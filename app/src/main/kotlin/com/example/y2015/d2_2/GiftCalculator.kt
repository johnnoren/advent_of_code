package com.example.y2015.d2_2

// Inspired by https://github.com/0legg/adventofcode/blob/master/year2015/src/main/kotlin/net/olegg/aoc/year2015/day2/Day2.kt
class GiftCalculator(boxSizeStringList: List<String>) {
    private val boxSizes = boxSizeStringList.map { it.split("x").map(String::toInt).sorted() }

    fun getPaper(): Int = boxSizes.sumOf { 3 * it[0] * it[1] + 2 * it[0] * it[2] + 2 * it[1] * it[2] }

    fun getRibbon(): Int = boxSizes.sumOf { 2 * (it[0] + it[1]) + it[0] * it[1] * it[2] }
}