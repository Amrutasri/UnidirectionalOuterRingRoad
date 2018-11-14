package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TollGateFourTest {

    @Test
    @DisplayName("should return 10 as cost for twoWheeler")
    void shouldReturn10AsCostForTwoWheeler(){
        TollGateFour tollGateFour = new TollGateFour();
        assertEquals(10,tollGateFour.getTwoWheelerCost());
    }

    @Test
    @DisplayName("should return 15 as cost for twoWheeler")
    void shouldReturn15AsCostForTwoWheeler(){
        TollGateFour tollGateFour = new TollGateFour();
        assertEquals(15,tollGateFour.getFourWheelerCost());
    }

}