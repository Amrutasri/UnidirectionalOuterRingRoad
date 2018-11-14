package controller;

import java.util.Scanner;

public class TollCollectorSystem {

    private Scanner scanner = new Scanner(System.in);
    private TollCollector tollCollector = new TollCollector();

    public void menu() {
        int userChoice = 1;
        String wheelerType;
        int entryTollNumber, exitTollNumber;
        int tollFee = 0;
        do {
            System.out.print("Enter vehicle type: ");
            wheelerType = scanner.nextLine();
            System.out.print("Enter entry toll number: ");
            entryTollNumber = scanner.nextInt();
            exitTollNumber = scanner.nextInt();

            tollFee = tollCollector.calculateTollFee(wheelerType,entryTollNumber,exitTollNumber);
            System.out.println("Collect Toll fee Rs."+tollFee+" for travel from TollGate#"+entryTollNumber+" to TollGate#"+exitTollNumber+".");

            System.out.println("If you want to exit please enter 0 : ");
            userChoice = scanner.nextInt();
        }while(userChoice!=0);
    }
}
