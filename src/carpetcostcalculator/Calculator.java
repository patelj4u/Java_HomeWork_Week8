package carpetcostcalculator;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //getTotalCost method that returns the total cost to cover the floor with the carpet by multiplying the area of the floor by the cost of the carpet.
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
