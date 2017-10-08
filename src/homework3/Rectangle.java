package homework3;

public class Rectangle extends Square {

    double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    public double area() {
        return (getA() * b);
    }

    @Override
    public double getPerimeter() {
        return 2 * (getA() + b);
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getA(), 2) + Math.pow(b, 2));
    }

    @Override
    public String toString() {
        return "The rectangle with a length " + getA() + " and a width " + getB() + ":\n"
                + "1. perimeter = " + getPerimeter() + "\n"
                + "2. area = " + area() + "\n"
                + "3. diagonal = " + getDiagonal() + "\n";
    }

    @Override
    public boolean equalsArea(GeometricFigures figure) {
        return area() == figure.area();
    }

    @Override
    public int amountSide() {
        return 4;
    }
}