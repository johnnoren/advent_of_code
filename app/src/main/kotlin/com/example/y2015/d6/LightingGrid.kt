package com.example.y2015.d6

import com.example.y2015.core.Position
import com.example.y2015.d6.LightingInstruction.LightingActionType.*

class LightingGrid {
    val values: Array<BooleanArray> = Array(1000) { BooleanArray(1000) { false } }

    fun applyLightingInstruction(instruction: LightingInstruction) {
        when(instruction.actionType) {
            TURN_ON -> turnOn(instruction)
            TURN_OFF -> turnOff(instruction)
            TOGGLE -> toggle(instruction)
        }
    }

    fun applyLightingInstruction(instructions: List<LightingInstruction>) {
        instructions.forEach { applyLightingInstruction(it) }
    }

    private fun turnOn(instruction: LightingInstruction) {
        changeLighting({ true }, instruction.startPosition, instruction.endPosition)
    }

    private fun turnOff(instruction: LightingInstruction) {
        changeLighting({ false }, instruction.startPosition, instruction.endPosition)
    }

    private fun toggle(instruction: LightingInstruction) {
        changeLighting({ !it }, instruction.startPosition, instruction.endPosition)
    }

    private fun changeLighting(changeFunction: (Boolean) -> Boolean, startPosition: Position, endPosition: Position) {
        val xRange = startPosition.x..endPosition.x
        val yRange = startPosition.y..endPosition.y
        for (x in xRange) {
            for (y in yRange) {
                values[x-1][y-1] = changeFunction(values[x-1][y-1])
            }
        }
    }
}