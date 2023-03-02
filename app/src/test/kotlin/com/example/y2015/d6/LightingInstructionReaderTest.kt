package com.example.y2015.d6

import com.example.y2015.core.Position
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class LightingInstructionReaderTest() {

    @Test
    @DisplayName("Should parse a string into a valid LightingInstruction")
    fun shouldParseStringCorrectly() {
        // Given
        val sut = LightingInstructionReader()
        val input1 = "turn on 489,959 through 759,964"
        val input1ExpectedActionType = LightingInstruction.LightingActionType.TURN_ON
        val input1ExpectedStartPosition = Position(489,959)
        val input1ExpectedEndPosition = Position(759,964)
        val input2 = "turn off 820,516 through 871,914"
        val input2ExpectedActionType = LightingInstruction.LightingActionType.TURN_OFF
        val input2ExpectedStartPosition = Position(820,516)
        val input2ExpectedEndPosition = Position(871,914)

        // When
        val input1ActualActionType = sut.read(input1).actionType
        val input1ActualStartPosition = sut.read(input1).startPosition
        val input1ActualEndPosition = sut.read(input1).endPosition
        val input2ActualActionType = sut.read(input2).actionType
        val input2ActualStartPosition = sut.read(input2).startPosition
        val input2ActualEndPosition = sut.read(input2).endPosition

        // Then
        assert(input1ActualActionType == input1ExpectedActionType)
        assert(input1ActualStartPosition == input1ExpectedStartPosition)
        assert(input1ActualEndPosition == input1ExpectedEndPosition)
        assert(input2ActualActionType == input2ExpectedActionType)
        assert(input2ActualStartPosition == input2ExpectedStartPosition)
        assert(input2ActualEndPosition == input2ExpectedEndPosition)

    }
}