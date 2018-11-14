public class TollGateTwo extends TollGate {

    TollGateTwo() {
        twoWheeler.cost = 20;
        fourWheeler.cost = 35;
    }
    @Override
    public int getTwoWheelerCost() {
        return twoWheeler.cost;
    }

    @Override
    public int getFourWheelerCost() {
        return fourWheeler.cost;
    }
}
