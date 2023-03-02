package com.example.y2015.core

data class Position(val x: Int, val y: Int) {
    fun moveUp() = Position(x,y+1)
    fun moveDown() = Position(x,y-1)
    fun moveLeft() = Position(x-1,y)
    fun moveRight() = Position(x+1,y)
}
