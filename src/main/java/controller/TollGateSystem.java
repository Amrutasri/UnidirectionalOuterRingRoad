package controller;

import model.TollGate;

import java.util.Scanner;

public class TollGateSystem {

    private Scanner intScanner = new Scanner(System.in);
    private Scanner stringScanner = new Scanner(System.in);
    private TollCollector tollCollector = new TollCollector();

    public TollGateSystem() {
        TollGate tollGate1 = new TollGate();
        tollGate1.setTollNumber(1);
        tollGate1.setChargeFor2Wheeler(25);
        tollGate1.setChargeFor4Wheeler(45);
        tollCollector.addTollGate(tollGate1);

        TollGate tollGate2 = new TollGate();
        tollGate2.setTollNumber(2);
        tollGate2.setChargeFor2Wheeler(20);
        tollGate2.setChargeFor4Wheeler(35);
        tollCollector.addTollGate(tollGate2);

        TollGate tollGate3 = new TollGate();
        tollGate3.setTollNumber(3);
        tollGate3.setChargeFor2Wheeler(15);
        tollGate3.setChargeFor4Wheeler(30);
        tollCollector.addTollGate(tollGate3);

        TollGate tollGate4 = new TollGate();
        tollGate4.setTollNumber(4);
        tollGate4.setChargeFor2Wheeler(10);
        tollGate4.setChargeFor4Wheeler(15);
        tollCollector.addTollGate(tollGate4);

    }

    public void menu() {
        int userChoice = 1;
        String wheelerType;
        int entryTollNumber, exitTollNumber;
        do {
            int tollFee = 0;
            System.out.print("Enter vehicle type: ");
            wheelerType = stringScanner.nextLine();
            System.out.print("Enter entry toll number: ");
            entryTollNumber = intScanner.nextInt();
            System.out.print("Enter exit toll number: ");
            exitTollNumber = intScanner.nextInt();

            tollFee = tollCollector.calculateTollFee(wheelerType,entryTollNumber,exitTollNumber);
            System.out.println("Collect Toll fee Rs."+tollFee+" for travel from TollGate#"+entryTollNumber+" to TollGate#"+exitTollNumber+".");

            System.out.print("If you want to exit please enter 0 : ");
            userChoice = intScanner.nextInt();
        }while(userChoice!=0);
    }
}
