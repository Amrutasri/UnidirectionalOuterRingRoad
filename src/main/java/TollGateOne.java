public class TollGateOne extends TollGate{

    TollGateOne() {
        twoWheeler.cost = 25;
        fourWheeler.cost = 45;
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
