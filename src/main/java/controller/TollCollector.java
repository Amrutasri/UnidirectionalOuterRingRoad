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
        int index = entryTollNumber;
        do{
            for(TollGate tollGate : tollGates) {
                if(tollGate.getTollNumber()==index) {
                    tollFee = tollFee + vehicleTypeHandler.getVehicleCost(vehicleType,tollGate);
                }
            }
            index++;
            if(index>tollGates.size()) {
                index = 1;
            }
        }while (index!=exitTollNumber);

        return tollFee;
    }
}
