package com.example.y2015.d5

import com.example.y2015.core.FileReader
import com.example.y2015.d5.StringPredicate.*

fun main() {
    val strings = FileReader().readLines("/com/example/y2015/d5.txt")

    val niceCount1 = part1(strings)
    val niceCount2 = part2(strings)

    println(niceCount1)
    println(niceCount2)
}

private fun part1(strings: List<String>): Int {
    val conditions = listOf(
        CONTAINS_THREE_OR_MORE_VOWELS,
        CONTAINS_AT_LEAST_ONE_LETTER_TWICE_IN_A_ROW,
        DOES_NOT_CONTAIN_AB_CD_PQ_XY
    )

    return StringValidator().countValid(strings, conditions)
}

private fun part2(strings: List<String>): Int {
    val conditions = listOf(
        CONTAINS_PAIR_OF_LETTERS_OCCURRING_AT_LEAST_TWICE,
        CONTAINS_AT_LEAST_ONE_LETTER_WHICH_REPEATS_WITH_LETTER_BETWEEN
    )

    return StringValidator().countValid(strings, conditions)
}