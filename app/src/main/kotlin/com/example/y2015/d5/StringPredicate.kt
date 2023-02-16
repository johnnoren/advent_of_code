package com.example.y2015.d5

enum class StringPredicate(val validate: (String) -> Boolean) {
    CONTAINS_THREE_OR_MORE_VOWELS({ "[aeiouAEIOU].*[aeiouAEIOU].*[aeiouAEIOU]".toRegex().containsMatchIn(it) }),
    CONTAINS_AT_LEAST_ONE_LETTER_TWICE_IN_A_ROW({ """([a-zA-Z])\1""".toRegex().containsMatchIn(it) }),
    DOES_NOT_CONTAIN_AB_CD_PQ_XY({ !"ab|cd|pq|xy".toRegex().containsMatchIn(it) }),
    CONTAINS_PAIR_OF_LETTERS_OCCURRING_AT_LEAST_TWICE({ """(..).*\1""".toRegex().containsMatchIn(it) }),
    CONTAINS_AT_LEAST_ONE_LETTER_WHICH_REPEATS_WITH_LETTER_BETWEEN({ """(.).\1""".toRegex().containsMatchIn(it) })

}