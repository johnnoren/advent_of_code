package com.example.y2015.d5

import com.example.y2015.core.FileReader

fun main() {
    val strings = FileReader().readLines("/com/example/y2015/d5.txt")

    val conditions = listOf(
        StringPredicate.CONTAINS_THREE_OR_MORE_VOWELS,
        StringPredicate.CONTAINS_AT_LEAST_ONE_LETTER_TWICE_IN_A_ROW,
        StringPredicate.DOES_NOT_CONTAIN_AB_CD_PQ_XY)

    val niceCount = StringValidator().countValid(strings,conditions)

    println(niceCount)
}