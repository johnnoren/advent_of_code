package com.example.y2015.d2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RibbonCalculatorTest(){

/*    A present with dimensions 2x3x4 requires 2+2+3+3 = 10 feet of ribbon to wrap the present plus 2*3*4 = 24 feet of
    ribbon for the bow, for a total of 34 feet.

    A present with dimensions 1x1x10 requires 1+1+1+1 = 4 feet of ribbon to wrap the present plus 1*1*10 = 10 feet of
    ribbon for the bow, for a total of 14 feet.*/

    val sut = RibbonCalculator()

    @Test
    @DisplayName("Should return total amount of ribbon needed")
    fun shouldReturnTotalRibbonNeeded(){
        // Given
        val input1 = BoxSize(2,3,4)
        val input1Expected = 34
        val input2 = BoxSize(1,1,10)
        val input2Expected = 14

        // When
        val input1Actual = sut.getRibbonLengthNeeded(input1)
        val input2Actual = sut.getRibbonLengthNeeded(input2)

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)


    }
}