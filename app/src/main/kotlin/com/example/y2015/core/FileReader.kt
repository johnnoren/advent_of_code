package com.example.y2015.core

import java.io.File
import java.io.IOException

class FileReader {
    fun readString(resourceName: String) : String {
        val file = getFile(resourceName)
        return file.readText(Charsets.UTF_8)
    }

    fun readLines(resourceName: String) : List<String> {
        val file = getFile(resourceName)
        return file.readLines(Charsets.UTF_8)
    }

    private fun getFile(resourceName: String) : File {
        val url = this::class.java.getResource(resourceName)
        return File(url?.file ?: throw IOException())
    }
}