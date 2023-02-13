package com.example.y2015.d2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class WrappingCalculatorTest() {
    val sut = WrappingCalculator()


/*  A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square feet of wrapping paper plus 6 square feet
    of slack, for a total of 58 square feet.

    A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square feet of wrapping paper plus 1 square foot
    of slack, for a total of 43 square feet. */

    @Test
    @DisplayName("Should return the total amount of wrapping paper needed")
    fun shouldReturnTotalNeeded(){
        // Given
        val input1 = BoxSize(2,3,4)
        val input2 = BoxSize(1,1,10)
        val input1Expected = 58
        val input2Expected = 43

        // When
        val input1Actual = sut.getSquareFeetNeeded(input1)
        val input2Actual = sut.getSquareFeetNeeded(input2)

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)

    }

}