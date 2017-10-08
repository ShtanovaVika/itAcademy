package homework3;

public class Triandle extends GeometricFigures implements Perimeter {

    private double h;
    private double b;
    private double c;


    public Triandle(double a, double h, double b, double c) {
        super(a);
        this.h = h;
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    @Override
    public double area() {
        return 1 / 2 * getA() * h;
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC();
    }

    public double bisector() {
        return Math.sqrt(getA() * getB() * (getA() + getB() + getC()) * (getA() + getB() - getC())) / getA() + getB();
    }

    @Override
    public String toString() {
        return "The triandle with side " + getA() + ", " + getB() + ", " + getC() + " and a height " + getH() + ": \n"
                + "1. perimeter = " + getPerimeter() + "\n"
                + "2. area = " + area() + "\n"
                + "3. bisector = " + bisector() + "\n";
    }

    @Override
    public boolean equalsArea(GeometricFigures figure) {
        return area() == figure.area();
    }

    @Override
    public int amountSide() {
        return 3;
    }
}