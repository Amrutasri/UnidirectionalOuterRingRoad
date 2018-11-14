package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TollGateTest {

    TollGate tollGate = new TollGate();

    @Test
    @DisplayName("should set the toll number as 1")
    void shouldSetTollNumberAs1() {
        tollGate.setTollNumber(1);
        assertEquals(1,tollGate.getTollNumber());
    }

    @Test
    @DisplayName("should set charge for 2Wheeler as 25")
    void shouldSetChargeFor2WheelerAs25() {
        tollGate.setChargeFor2Wheeler(25);
        assertEquals(25,tollGate.getChargeFor2Wheeler());
    }

    @Test
    @DisplayName("should set charge for 4Wheeler as 20")
    void shouldSetChargeFor4WheelerAs20() {
        tollGate.setChargeFor4Wheeler(20);
        assertEquals(20,tollGate.getChargeFor4Wheeler());
    }
}