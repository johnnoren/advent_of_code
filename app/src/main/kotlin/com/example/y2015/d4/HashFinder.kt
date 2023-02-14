package com.example.y2015.d4

class HashFinder(private val hashGenerator: Md5Generator = Md5Generator()) {

    fun getNumber(input: String, numberOfZeroes: Int): Int {
        var counter = 1
        val getHash = { hashGenerator.getHash(input, counter) }
        val startsWith5Zeroes: (Md5Hash) -> Boolean = { it.toHex().startsWith("0".repeat(numberOfZeroes))}

        while (!startsWith5Zeroes(getHash())) counter++

        return counter
    }

}