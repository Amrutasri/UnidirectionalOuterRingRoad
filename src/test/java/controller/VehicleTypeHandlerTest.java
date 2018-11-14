package controller;

import model.TollGate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTypeHandlerTest {

    VehicleTypeHandler vehicleTypeHandler = new VehicleTypeHandler();
    TollGate tollGate = new TollGate();
    int vehicleCost;

    @Test
    @DisplayName("should return 25 as cost for 2Wheeler")
    void shouldReturn25AsCostFor2Wheeler() {
        tollGate.setChargeFor2Wheeler(25);
        vehicleCost = vehicleTypeHandler.getVehicleCost("2Wheeler",tollGate);
        assertEquals(25,vehicleCost);
    }

    @Test
    @DisplayName("should return 20 as cost for 4Wheeler")
    void shouldReturn20AsCostFor4Wheeler() {
        tollGate.setChargeFor4Wheeler(20);
        vehicleCost = vehicleTypeHandler.getVehicleCost("4Wheeler",tollGate);
        assertEquals(20,vehicleCost);
    }

}