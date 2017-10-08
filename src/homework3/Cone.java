package homework3;

import static homework3.Circle.NUMBER_PI;

public class Cone extends Triandle {

    public Cone(double a, double h, double b, double c) {
        super(a, h, b, c);
    }

    @Override
    public double area() {
        return NUMBER_PI * Math.pow(getA(), 2) + NUMBER_PI * getA() * (Math.sqrt((Math.pow(getA(), 2) + (Math.pow(getH(), 2)))));
    }

    @Override
    public String toString() {
        return "The cycle area with radiu " + getA() + " and height " + getH() + " = " + area();
    }

    @Override
    public int amountSide() {
        return 0;
    }
}