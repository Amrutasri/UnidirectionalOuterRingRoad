package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TollGateOneTest {

    @Test
    @DisplayName("should return 25 as cost for twoWheeler")
    void shouldReturn25AsCostForTwoWheeler(){
        TollGateOne tollGateOne = new TollGateOne();
        assertEquals(25,tollGateOne.getTwoWheelerCost());
    }

    @Test
    @DisplayName("should return 45 as cost for twoWheeler")
    void shouldReturn45AsCostForTwoWheeler(){
        TollGateOne tollGateOne = new TollGateOne();
        assertEquals(45,tollGateOne.getFourWheelerCost());
    }
}