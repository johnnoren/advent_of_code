package com.example.y2015.d6

import com.example.y2015.core.Position
import com.example.y2015.d6.LightingInstruction.*
import java.lang.RuntimeException

class LightingInstructionReader {
    fun read(instructionString: String): LightingInstruction {
        val actionType = getLightingActionType(instructionString)
        val startPosition = getStartPosition(instructionString)
        val endPosition = getEndPosition(instructionString)
        return LightingInstruction(actionType,startPosition,endPosition)
    }

    fun readAll(instructionsList: List<String>) : List<LightingInstruction> = instructionsList.map { read(it) }

    private fun getLightingActionType(string: String) : LightingActionType {
        val matchResult = "(turn on|turn off|toggle)".toRegex().find(string) ?: throw RuntimeException()
        return when(matchResult.value) {
            "turn on" -> LightingActionType.TURN_ON
            "turn off" -> LightingActionType.TURN_OFF
            "toggle" -> LightingActionType.TOGGLE
            else -> throw RuntimeException()
        }
    }

    private fun getStartPosition(string: String) : Position {
        val matchResult = "(?<=turn on |turn off |toggle )[0-9][0-9]?[0-9]?,[1-9][0-9]?[0-9]?".toRegex().find(string) ?: throw RuntimeException()
        val xy = matchResult.value.split(',').map { str -> str.toInt() }
        return Position(xy[0],xy[1])
    }

    private fun getEndPosition(string: String) : Position {
        val matchResult = "(?<=through )[0-9][0-9]?[0-9]?,[0-9][0-9]?[0-9]?".toRegex().find(string) ?: throw RuntimeException()
        val xy = matchResult.value.split(',').map { str -> str.toInt() }
        return Position(xy[0],xy[1])
    }
}