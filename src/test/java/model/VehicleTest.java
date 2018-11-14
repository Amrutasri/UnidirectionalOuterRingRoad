package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Vehicle vehicle = new Vehicle();

    @Test
    @DisplayName("should set the name as 2Wheeler.")
    void shouldSetNameAs2Wheeler() {
        vehicle.setName("2Wheeler");
        assertEquals("2Wheeler",vehicle.getName());
    }

    @Test
    @DisplayName("should set charges as 25.")
    void shouldChargesAs25() {
        vehicle.setCharge(25);
        assertEquals(25,vehicle.getCharge());
    }

}