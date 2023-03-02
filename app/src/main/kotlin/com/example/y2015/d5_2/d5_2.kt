package com.example.y2015.d5_2

import com.example.y2015.core.FileReader

fun main() {
    val strings = FileReader().readLines("/com/example/y2015/d5.txt")

    println(StringValidator().first(strings))
    println(StringValidator().second(strings))

}
