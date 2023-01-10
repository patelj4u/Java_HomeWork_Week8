package carpetcostcalculator;

public class Carpet {

    private double cost;

    //It also includes a getCost method that returns the cost of the carpet as a double.
    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
