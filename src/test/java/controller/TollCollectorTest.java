package controller;

import model.TollGate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TollCollectorTest {

    TollCollector tollCollector = new TollCollector();
    TollGate tollGate1 = new TollGate();
    TollGate tollGate2 = new TollGate();
    TollGate tollGate3 = new TollGate();
    int tollFee;

    @Test
    @DisplayName("should return 25 as toll fee.")
    void shouldReturn25AsTollFee() {
        tollGate1.setTollNumber(1);tollGate1.setChargeFor2Wheeler(25);
        tollCollector.addTollGate(tollGate1);

        tollGate2.setTollNumber(2);tollGate2.setChargeFor2Wheeler(20);
        tollCollector.addTollGate(tollGate2);

        tollFee = tollCollector.calculateTollFee("2Wheeler",1,2);

        assertEquals(25,tollFee);
    }

    @Test
    @DisplayName("should return  as 45 toll fee.")
    void shouldReturn45AsTollFee() {
        tollGate1.setTollNumber(1); tollGate2.setTollNumber(2); tollGate3.setTollNumber(3);

        tollGate1.setChargeFor4Wheeler(25); tollGate2.setChargeFor4Wheeler(20); tollGate3.setChargeFor4Wheeler(15);

        tollCollector.addTollGate(tollGate1); tollCollector.addTollGate(tollGate2); tollCollector.addTollGate(tollGate3);

        tollFee = tollCollector.calculateTollFee("4Wheeler",1,3);

        assertEquals(45,tollFee);

    }

}