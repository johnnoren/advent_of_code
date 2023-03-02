package com.example.y2015.d6

import com.example.y2015.core.Position
import com.example.y2015.d6.LightingInstruction.LightingActionType.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class LightingGridTest {

    @Test
    @DisplayName("Should toggle lights as requested")
    fun applyLightingInstruction() {
        // Given
        val sut1 = LightingGrid()
        val sut2 = LightingGrid()
        val sut3 = LightingGrid()
        val inputTurnOn = LightingInstruction(TURN_ON, Position(3,3), Position(5,5))
        val inputTurnOff = LightingInstruction(TURN_OFF, Position(3,3),Position(5,5))
        val inputToggle = LightingInstruction(TOGGLE, Position(3,3),Position(5,5))
        val inputTurnOnExpected = true
        val inputTurnOffExpected = false
        val inputToggleExpected = true

        // When
        sut1.applyLightingInstruction(inputTurnOn)
        val inputTurnOnActual = listOf(
            sut1.values[2][2],sut1.values[2][3],sut1.values[2][4],
            sut1.values[3][2],sut1.values[3][3],sut1.values[3][4],
            sut1.values[4][2],sut1.values[4][3],sut1.values[4][4])

        sut2.applyLightingInstruction(inputTurnOff)
        val inputTurnOffActual = listOf(
            sut2.values[2][2],sut2.values[2][3],sut2.values[2][4],
            sut2.values[3][2],sut2.values[3][3],sut2.values[3][4],
            sut2.values[4][2],sut2.values[4][3],sut2.values[4][4])

        sut3.applyLightingInstruction(inputToggle)
        val inputToggleActual = listOf(
            sut3.values[2][2],sut3.values[2][3],sut3.values[2][4],
            sut3.values[3][2],sut3.values[3][3],sut3.values[3][4],
            sut3.values[4][2],sut3.values[4][3],sut3.values[4][4])

        // Then
        assert(inputTurnOnActual.all { it == inputTurnOnExpected })
        assert(inputTurnOffActual.all { it == inputTurnOffExpected })
        assert(inputToggleActual.all { it == inputToggleExpected })

    }

}