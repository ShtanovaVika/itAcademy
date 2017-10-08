package homework3;


public class Square extends GeometricFigures implements Perimeter, Diagonal {

    public Square(double a) {
        super(a);
    }

    @Override
    public double area() {
        return Math.pow(getA(), 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * getA();
    }

    @Override
    public double getDiagonal() {
        return getA() * Math.sqrt(2);
    }

    @Override
    public String toString() {
        return "The square with a side " + getA() + ": \n"
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