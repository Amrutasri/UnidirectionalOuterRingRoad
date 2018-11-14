package controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TollCollectorTest {

    @Test
    @DisplayName("should return 0 as toll fee.")
    void shouldReturn0AsTollFee() {
        TollCollector tollCollector = new TollCollector();
        int tollFee = tollCollector.calculateTollFee("2W",1,2);
        assertEquals(0,tollFee);
    }

}