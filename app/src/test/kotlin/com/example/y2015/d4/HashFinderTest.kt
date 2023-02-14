package com.example.y2015.d4

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class HashFinderTest {

/*  If your secret key is abcdef, the answer is 609043, because the MD5 hash of abcdef609043 starts with five zeroes
    (000001dbbfa...), and it is the lowest such number to do so.

    If your secret key is pqrstuv, the lowest number it combines with to make an MD5 hash starting with five zeroes is
    1048970; that is, the MD5 hash of pqrstuv1048970 looks like 000006136ef....*/

    val sut = HashFinder()

    @Test
    @DisplayName("Should return the lowest number generating a certain hash")
    fun shouldReturnCorrectNumberForHash() {
        // Given
        val input1 = "abcdef"
        val input1Expected = 609043
        val input2 = "pqrstuv"
        val input2Expected = 1048970

        // When
        val input1Actual = sut.getNumber(input1,5)
        val input2Actual = sut.getNumber(input2,5)

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)

    }
}