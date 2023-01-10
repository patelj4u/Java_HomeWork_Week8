package sumcalculator;

public class SimpleCalculator {

    private double firstNumber;
    private double secoundNumber;

    public double getFirstNumber() {
        return firstNumber;

    }

    public double getSecoundNumber() {
        return secoundNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecoundNumber(double secoundNumber) {
        this.secoundNumber = secoundNumber;
    }
    public double getAdditionResult(){
        return firstNumber+ secoundNumber;
    }
    public double getSubtractionResult(){
        return firstNumber- secoundNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secoundNumber;
    }
    public double getDivisionResult(){
        if (secoundNumber==0){
            return this.secoundNumber=0;
        }
        else {
            return  firstNumber / secoundNumber;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecoundNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecoundNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }


}
