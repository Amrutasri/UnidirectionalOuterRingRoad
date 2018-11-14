package controller;

import model.TollGate;

import java.util.ArrayList;
import java.util.List;

public class TollCollector {

    private List<TollGate> tollGates = new ArrayList<>();
    private VehicleTypeHandler vehicleTypeHandler = new VehicleTypeHandler();

    public void addTollGate(TollGate tollGate) {
        tollGates.add(tollGate);
    }

    public int calculateTollFee(String vehicleType, int entryTollNumber, int exitTollNumber) {
        int tollFee = 0;
        for(int i = entryTollNumber; i<exitTollNumber; i++) {
            for(TollGate tollGate : tollGates) {
                if(tollGate.getTollNumber()==i) {
                    tollFee = tollFee + vehicleTypeHandler.getVehicleCost(vehicleType,tollGate);
                }
            }
        }

        return tollFee;
    }
}
