package com.example.y2015.d6

import com.example.y2015.core.Position

data class LightingInstruction(val actionType: LightingActionType, val startPosition: Position, val endPosition: Position) {

    enum class LightingActionType() {
        TURN_ON,
        TURN_OFF,
        TOGGLE
    }

}
