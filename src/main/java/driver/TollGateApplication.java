package driver;

import controller.TollCollector;
import controller.TollGateSystem;
import model.TollGate;

public class TollGateApplication {

    public static void main(String args[]) {

        System.out.println("Welcome to Electronic Toll Collection");

        TollGateSystem tollGateSystem = new TollGateSystem();
        tollGateSystem.menu();
    }
}
