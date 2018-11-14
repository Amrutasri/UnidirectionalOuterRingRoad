package controller;

import model.TollGate;

public class VehicleTypeHandler {

    int vehicleCost;

    public int getVehicleCost(String vehicleType, TollGate tollGate) {
        switch (vehicleType) {

            case "2Wheeler" : vehicleCost = tollGate.getChargeFor2Wheeler();
                              break;

            case "4Wheeler" : vehicleCost = tollGate.getChargeFor4Wheeler();
                              break;
        }
        return vehicleCost;
    }
}
