package homework3;

public class Circle extends GeometricFigures implements Perimeter {

    protected final static double NUMBER_PI = 3.14;

    public Circle(double a) {
        super(a);
    }

    public double area() {
        return Math.pow(getA(), 2) * NUMBER_PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * NUMBER_PI * getA();
    }

    @Override
    public String toString() {
        return "The circle with a radius " + getA() + ":\n"
                + "1. perimeter = " + getPerimeter() + "\n"
                + "2. area = " + area() + "\n";
    }

    @Override
    public boolean equalsArea(GeometricFigures figure) {
        return area() == figure.area();
    }

    @Override
    public int amountSide() {
        return 0;
    }
}