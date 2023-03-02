package com.example.y2015.d5_2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StringValidatorTest {

    @Test
    @DisplayName("Should count the correct number of strings (first part)")
    fun first() {
        // Given
        val input = listOf("sszojmmrrkwuftyv", "isaljhemltsdzlum", "fujcyucsrxgatisb", "qiqqlmcgnhzparyg",
            "oijbmduquhfactbc", "jqzuvtggpdqcekgk", "zwqadogmpjmmxijf", "uilzxjythsqhwndh", "gtssqejjknzkkpvw",
            "wrggegukhhatygfi", "vhtcgqzerxonhsye", "tedlwzdjfppbmtdx", "iuvrelxiapllaxbg", "feybgiimfthtplui",
            "qxmmcnirvkzfrjwd", "vfarmltinsriqxpu")

        val expected = 4

        // When
        val actual = StringValidator().first(input)

        // Then
        assert(actual == expected)

    }

    @Test
    @DisplayName("Should count the correct number of strings (second part)")
    fun second() {
        // Given
        val input = listOf("sszojmmrrkwuftyv", "isaljhemltsdzlum", "fujcyucsrxgatisb", "qiqqlmcgnhzparyg",
            "oijbmduquhfactbc", "jqzuvtggpdqcekgk", "zwqadogmpjmmxijf", "uilzxjythsqhwndh", "gtssqejjknzkkpvw",
            "wrggegukhhatygfi", "vhtcgqzerxonhsye", "tedlwzdjfppbmtdx", "iuvrelxiapllaxbg", "feybgiimfthtplui",
            "qxmmcnirvkzfrjwd", "vfarmltinsriqxpu")

        val expected = 0

        // When
        val actual = StringValidator().second(input)

        // Then
        assert(actual == expected)

    }
}