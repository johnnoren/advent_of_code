package com.example.y2015.d4

data class Md5Hash(val byteArray: ByteArray) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Md5Hash

        if (!byteArray.contentEquals(other.byteArray)) return false

        return true
    }

    override fun hashCode(): Int {
        return byteArray.contentHashCode()
    }

    fun toHex() : String = byteArray.joinToString(separator = "", transform = { byte -> "%02x".format(byte) })

}