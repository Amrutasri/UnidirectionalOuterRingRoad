package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TollGateThreeTest {

    @Test
    @DisplayName("should return 15 as cost for twoWheeler")
    void shouldReturn15AsCostForTwoWheeler(){
        TollGateThree tollGateThree = new TollGateThree();
        assertEquals(15,tollGateThree.getTwoWheelerCost());
    }

    @Test
    @DisplayName("should return 30 as cost for twoWheeler")
    void shouldReturn30AsCostForTwoWheeler(){
        TollGateThree tollGateThree = new TollGateThree();
        assertEquals(30,tollGateThree.getFourWheelerCost());
    }

}