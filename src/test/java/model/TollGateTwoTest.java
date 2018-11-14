package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TollGateTwoTest {

    @Test
    @DisplayName("should return 20 as cost for twoWheeler")
    void shouldReturn20AsCostForTwoWheeler(){
        TollGateTwo tollGateTwo = new TollGateTwo();
        assertEquals(20,tollGateTwo.getTwoWheelerCost());
    }

    @Test
    @DisplayName("should return 35 as cost for twoWheeler")
    void shouldReturn35AsCostForTwoWheeler(){
        TollGateTwo tollGateTwo = new TollGateTwo();
        assertEquals(35,tollGateTwo.getFourWheelerCost());
    }

}