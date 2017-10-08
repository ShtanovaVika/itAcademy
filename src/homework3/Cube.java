package homework3;

public class Cube extends Square implements Volume {

    public Cube(double a) {
        super(a);
    }

    @Override
    public double area() {
        return 6 * Math.pow(getA(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getA(), 3);
    }

    @Override
    public double getDiagonal() {
        return getA() * Math.sqrt(3);
    }

    @Override
    public String toString() {
        return "The cube with side " + getA() + ": \n"
                + "1. area = " + area() + "\n"
                + "2. volume = " + getVolume() + "\n"
                + "3. diagonal = " + getDiagonal() + "\n";
    }

    @Override
    public boolean equalsArea(GeometricFigures figure) {
        return area() == figure.area();
    }

    @Override
    public int amountSide() {
        return 12;
    }
}