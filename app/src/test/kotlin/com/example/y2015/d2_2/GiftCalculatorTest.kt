package com.example.y2015.d2_2
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GiftCalculatorTest {

    @Test
    @DisplayName("Should return the total amount of wrapping paper needed")
    fun shouldReturnTotalNeeded(){
        // Given
        val input1 = listOf("2x3x4")
        val input2 = listOf("1x1x10")
        val input1Expected = 58
        val input2Expected = 43
        val sut1 = GiftCalculator(input1)
        val sut2 = GiftCalculator(input2)

        // When
        val input1Actual = sut1.getPaper()
        val input2Actual = sut2.getPaper()

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)

    }

    @Test
    @DisplayName("Should return total amount of ribbon needed")
    fun shouldReturnTotalRibbonNeeded(){
        // Given
        val input1 = listOf("2x3x4")
        val input1Expected = 34
        val input2 = listOf("1x1x10")
        val input2Expected = 14
        val sut1 = GiftCalculator(input1)
        val sut2 = GiftCalculator(input2)

        // When
        val input1Actual = sut1.getRibbon()
        val input2Actual = sut2.getRibbon()

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)


    }
}