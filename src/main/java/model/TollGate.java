package model;

public class TollGate {

    private int tollNumber;
    private Vehicle twoWheeler = new Vehicle();
    private Vehicle fourWheeler = new Vehicle();



    public void setTollNumber(int tollNumber) {
        this.tollNumber = tollNumber;
    }

    public int getTollNumber() {
        return tollNumber;
    }

    public void setChargeFor2Wheeler(int charge) {
        twoWheeler.setName("2Wheeler");
        twoWheeler.setCharge(charge);
    }

    public int getChargeFor2Wheeler() {
        return twoWheeler.getCharge();
    }

    public void setChargeFor4Wheeler(int charge) {
        twoWheeler.setName("4Wheeler");
        fourWheeler.setCharge(charge);
    }

    public int getChargeFor4Wheeler() {
        return fourWheeler.getCharge();
    }
}
