public class TollGateFour extends TollGate {

    TollGateFour() {
        twoWheeler.cost = 10;
        fourWheeler.cost = 15;
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
