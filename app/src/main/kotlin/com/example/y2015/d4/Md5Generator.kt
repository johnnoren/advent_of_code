package com.example.y2015.d4

import java.security.MessageDigest
import kotlin.text.Charsets.UTF_8

class Md5Generator {
    fun getHash(secretKey: String, number: Int) : Md5Hash {
        val inputString = secretKey + number
        return Md5Hash(MessageDigest.getInstance("MD5").digest(inputString.toByteArray(UTF_8)))
    }
}