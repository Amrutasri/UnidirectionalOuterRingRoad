public class TollGateThree extends TollGate {

    TollGateThree() {
        twoWheeler.cost = 15;
        fourWheeler.cost = 30;
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
