package com.example.y2015.d5

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class StringPredicateTest {

/*  It contains at least three vowels (aeiou only), like aei, xazegov, or aeiouaeiouaeiou.

It contains at least one letter that appears twice in a row, like xx, abcdde (dd), or aabbccdd (aa, bb, cc, or dd).

It does not contain the strings ab, cd, pq, or xy, even if they are part of one of the other requirements.*/

    @Test
    @DisplayName("Contains have at least three vowels (aeiou only)")
    fun containsAtLeastThreeVowels() {
        // Given
        val sut = StringPredicate.CONTAINS_THREE_OR_MORE_VOWELS
        val input1 = "trwejjikkklnci"
        val expected1 = true
        val input2 = "trwejjkkklnci"
        val expected2 = false
        val input3 = "trAwejjikkklnci"
        val expected3 = true

        // When
        val actual1 = sut.validate(input1)
        val actual2 = sut.validate(input2)
        val actual3 = sut.validate(input3)

        // Then
        assert(actual1 == expected1)
        assert(actual2 == expected2)
        assert(actual3 == expected3)

    }

    @Test
    @DisplayName("Contains at least one letter that appears twice in a row")
    fun containsAtLeastOneLetterTwiceInARow() {
        // Given
        val sut = StringPredicate.CONTAINS_AT_LEAST_ONE_LETTER_TWICE_IN_A_ROW
        val input1 = "abcdde"
        val expected1 = true
        val input2 = "abcdide"
        val expected2 = false
        val input3 = "trAwejjikkklnci"
        val expected3 = true

        // When
        val actual1 = sut.validate(input1)
        val actual2 = sut.validate(input2)
        val actual3 = sut.validate(input3)

        // Then
        assert(actual1 == expected1)
        assert(actual2 == expected2)
        assert(actual3 == expected3)

    }

    @Test
    @DisplayName("Does not contain the strings ab, cd, pq, or xy")
    fun doesNotContainAbCdPqXy() {
        // Given
        val sut = StringPredicate.DOES_NOT_CONTAIN_AB_CD_PQ_XY
        val input1 = "acedefgh"
        val expected1 = true
        val input2 = "abcdefgh"
        val expected2 = false
        val input3 = "trAwejjikkklnci"
        val expected3 = true

        // When
        val actual1 = sut.validate(input1)
        val actual2 = sut.validate(input2)
        val actual3 = sut.validate(input3)

        // Then
        assert(actual1 == expected1)
        assert(actual2 == expected2)
        assert(actual3 == expected3)

    }
}