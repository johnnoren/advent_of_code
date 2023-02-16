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

/*  It contains a pair of any two letters that appears at least twice in the string without overlapping, like xyxy (xy)
    or aabcdefgaa (aa), but not like aaa (aa, but it overlaps).

    It contains at least one letter which repeats with exactly one letter between them, like xyx, abcdefeghi (efe), or
    even aaa.*/

    @Test
    @DisplayName("Contains a pair of any two letters that appears at least twice in the string without overlapping")
    fun containsPairOfLettersOccurringAtLeastTwice() {
        // Given
        val sut = StringPredicate.CONTAINS_PAIR_OF_LETTERS_OCCURRING_AT_LEAST_TWICE
        val input1 = "xyxybcdefgxy"
        val expected1 = true
        val input2 = "xxxbcdefgxy"
        val expected2 = false
        val input3 = "xxybcdefxyg"
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
    @DisplayName("Contains at least one letter which repeats with exactly one letter between them")
    fun containsAtLeastOneLetterWhichRepeatsWithOneLetterBetween() {
        // Given
        val sut = StringPredicate.CONTAINS_AT_LEAST_ONE_LETTER_WHICH_REPEATS_WITH_LETTER_BETWEEN
        val input1 = "acecdefgh"
        val expected1 = true
        val input2 = "abcdefgh"
        val expected2 = false
        val input3 = "trAwejjijkkklnci"
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