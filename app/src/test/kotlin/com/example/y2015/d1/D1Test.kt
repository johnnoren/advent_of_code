package com.example.y2015.d1

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class D1Test {
    private val sut = D1()

/*  (()) and ()() both result in floor 0.
    ((( and (()(()( both result in floor 3.
    ))((((( also results in floor 3.
    ()) and ))( both result in floor -1 (the first basement level).
    ))) and )())()) both result in floor -3.*/

    @Test
    @DisplayName("""(()) and ()() both result in floor 0.""")
    fun shouldReturnCorrectFloorCase1() {
        // Given
        val input1 = "(())"
        val input2 = "()()"
        val expectedFloor = 0

        // When
        val input1ActualFloor = sut.getFloor(input1)
        val input2ActualFloor = sut.getFloor(input2)

        // Then
        assert(input1ActualFloor == expectedFloor)
        assert(input2ActualFloor == expectedFloor)

    }

    @Test
    @DisplayName("""((( and (()(()( both result in floor 3.""")
    fun shouldReturnCorrectFloorCase2() {
        // Given
        val input1 = "((("
        val input2 = "(()(()("
        val expectedFloor = 3

        // When
        val input1ActualFloor = sut.getFloor(input1)
        val input2ActualFloor = sut.getFloor(input2)

        // Then
        assert(input1ActualFloor == expectedFloor)
        assert(input2ActualFloor == expectedFloor)

    }

    @Test
    @DisplayName("""))((((( also results in floor 3.""")
    fun shouldReturnCorrectFloorCase3() {
        // Given
        val input = "))((((("
        val expectedFloor = 3

        // When
        val inputActualFloor = sut.getFloor(input)

        // Then
        assert(inputActualFloor == expectedFloor)

    }

    @Test
    @DisplayName("""()) and ))( both result in floor -1 (the first basement level).""")
    fun shouldReturnCorrectFloorCase4() {
        // Given
        val input1 = "())"
        val input2 = "))("
        val expectedFloor = -1

        // When
        val input1ActualFloor = sut.getFloor(input1)
        val input2ActualFloor = sut.getFloor(input2)

        // Then
        assert(input1ActualFloor == expectedFloor)
        assert(input2ActualFloor == expectedFloor)

    }

    @Test
    @DisplayName("""))) and )())()) both result in floor -3.""")
    fun shouldReturnCorrectFloorCase5() {
        // Given
        val input1 = ")))"
        val input2 = ")())())"
        val expectedFloor = -3

        // When
        val input1ActualFloor = sut.getFloor(input1)
        val input2ActualFloor = sut.getFloor(input2)

        // Then
        assert(input1ActualFloor == expectedFloor)
        assert(input2ActualFloor == expectedFloor)

    }

    /*Now, given the same instructions, find the position of the first character that causes him to enter the basement
    (floor -1). The first character in the instructions has position 1, the second character has position 2, and so on.

    For example:

    ) causes him to enter the basement at character position 1.
    ()()) causes him to enter the basement at character position 5.
    What is the position of the character that causes Santa to first enter the basement?*/

    @Test
    @DisplayName("Should return position of character that leads to the basement (floor level -1)")
    fun shouldReturnPositionOfCharacterLeadingToBasement() {
        // Given
        val input1String = "(()))"
        val input1Expected = 5

        val input2String = ")"
        val input2Expected = 1

        // When
        val input1Actual = sut.getBasementCharacterPosition(input1String)
        val input2Actual = sut.getBasementCharacterPosition(input2String)

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)

    }
}

