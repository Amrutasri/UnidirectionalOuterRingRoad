package model;

public abstract class TollGate {

    String name;
    TypeOfWheeler twoWheeler = new TwoWheeler();
    TypeOfWheeler fourWheeler = new FourWheeler();

    public abstract int getTwoWheelerCost();
    public abstract int getFourWheelerCost();

}
