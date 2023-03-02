package com.example.y2015.d5_2

// Inspired by https://github.com/0legg/adventofcode/blob/master/year2015/src/main/kotlin/net/olegg/aoc/year2015/day5/Day5.kt
class StringValidator {
    private val CONTAINS_THREE_OR_MORE_VOWELS: (String) -> Boolean = { "[aeiouAEIOU].*[aeiouAEIOU].*[aeiouAEIOU]".toRegex().containsMatchIn(it) }
    private val CONTAINS_AT_LEAST_ONE_LETTER_TWICE_IN_A_ROW: (String) -> Boolean = { """([a-zA-Z])\1""".toRegex().containsMatchIn(it) }
    private val DOES_NOT_CONTAIN_AB_CD_PQ_XY: (String) -> Boolean = { !"ab|cd|pq|xy".toRegex().containsMatchIn(it) }
    private val CONTAINS_PAIR_OF_LETTERS_OCCURRING_AT_LEAST_TWICE: (String) -> Boolean = { """(..).*\1""".toRegex().containsMatchIn(it) }
    private val CONTAINS_AT_LEAST_ONE_LETTER_WHICH_REPEATS_WITH_LETTER_BETWEEN: (String) -> Boolean = { """(.).\1""".toRegex().containsMatchIn(it) }

    fun first(lines: List<String>) : Int {
        return lines
            .filter(CONTAINS_THREE_OR_MORE_VOWELS)
            .filter(CONTAINS_AT_LEAST_ONE_LETTER_TWICE_IN_A_ROW)
            .count(DOES_NOT_CONTAIN_AB_CD_PQ_XY)
    }

    fun second(lines: List<String>) : Int {
        return lines
            .filter(CONTAINS_PAIR_OF_LETTERS_OCCURRING_AT_LEAST_TWICE)
            .count(CONTAINS_AT_LEAST_ONE_LETTER_WHICH_REPEATS_WITH_LETTER_BETWEEN)
    }


}
