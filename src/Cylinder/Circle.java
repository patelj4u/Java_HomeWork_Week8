package Cylinder;

public class Circle {

    public double redius;

    public Circle(double redius){
        if(redius<0){
            this.redius=0;
        }else {
            this.redius=redius;
        }
    }
    public double getRedius(){
        return redius;
    }
    public double getArea(){
        return Math.PI*redius*redius;
    }
}
