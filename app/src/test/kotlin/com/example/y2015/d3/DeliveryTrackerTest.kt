package com.example.y2015.d3

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class DeliveryTrackerTest {

/*    > delivers presents to 2 houses: one at the starting location, and one to the east.
    ^>v< delivers presents to 4 houses in a square, including twice to the house at his starting/ending location.
    ^v^v^v^v^v delivers a bunch of presents to some very lucky children at only 2 houses.*/

    val deliveryTracker = DeliveryTracker()
    
    @Test
    @DisplayName("Should return correct number of houses that received at least one delivery")
    fun shouldReturnCorrectNumberOfHouses(){
        // Given
        val criteria : (Int) -> Boolean = { it > 0 }
        val input1 = ">"
        val input1Expected = 2
        val input2 = "^>v<"
        val input2Expected = 4
        val input3 = "^v^v^v^v^v"
        val input3Expected = 2

        // When
        var input1Actual = deliveryTracker.getNumberOfHouses(input1,criteria)
        var input2Actual = deliveryTracker.getNumberOfHouses(input2,criteria)
        var input3Actual = deliveryTracker.getNumberOfHouses(input3,criteria)

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)
        assert(input3Actual == input3Expected)

    }
}