package com.example.y2015.d2

data class BoxSize(val height: Int, val width: Int, val length: Int) {

    companion object {
        @JvmStatic // generating true static methods for Java interoperability
        fun fromString(string: String) : BoxSize {
            val dimensionsList = string.split('x')
            return BoxSize(dimensionsList[0].toInt(), dimensionsList[1].toInt(), dimensionsList[2].toInt())
        }
    }
}