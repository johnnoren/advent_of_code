package com.example.y2015.d3_2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class DeliveryTrackerTest {

/*    > delivers presents to 2 houses: one at the starting location, and one to the east.
    ^>v< delivers presents to 4 houses in a square, including twice to the house at his starting/ending location.
    ^v^v^v^v^v delivers a bunch of presents to some very lucky children at only 2 houses.*/

    val deliveryTracker = DeliveryTracker()
    
    @Test
    @DisplayName("Should return correct number of houses that received at least one delivery from a single santa")
    fun shouldReturnCorrectNumberOfHousesForOneSanta(){
        // Given
        val input1 = ">"
        val input1Expected = 2
        val input2 = "^>v<"
        val input2Expected = 4
        val input3 = "^v^v^v^v^v"
        val input3Expected = 2

        // When
        val input1Actual = deliveryTracker.getNumberOfHouses(input1,false)
        val input2Actual = deliveryTracker.getNumberOfHouses(input2,false)
        val input3Actual = deliveryTracker.getNumberOfHouses(input3,false)

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)
        assert(input3Actual == input3Expected)

    }

   /* ^v delivers presents to 3 houses, because Santa goes north, and then Robo-Santa goes south.
    ^>v< now delivers presents to 3 houses, and Santa and Robo-Santa end up back where they started.
    ^v^v^v^v^v now delivers presents to 11 houses, with Santa going one direction and Robo-Santa going the other.*/

    @Test
    @DisplayName("Should return correct number of houses that received at least one delivery from santa or robot")
    fun shouldReturnCorrectNumberOfHousesForTwoSantas(){
        // Given
        val input1 = "^v"
        val input1Expected = 3
        val input2 = "^>v<"
        val input2Expected = 3
        val input3 = "^v^v^v^v^v"
        val input3Expected = 11

        // When
        val input1Actual = deliveryTracker.getNumberOfHouses(input1,true)
        val input2Actual = deliveryTracker.getNumberOfHouses(input2,true)
        val input3Actual = deliveryTracker.getNumberOfHouses(input3,true)

        // Then
        assert(input1Actual == input1Expected)
        assert(input2Actual == input2Expected)
        assert(input3Actual == input3Expected)

    }
}