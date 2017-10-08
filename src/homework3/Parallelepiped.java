package homework3;

public class Parallelepiped extends Rectangle implements Volume {
    private double c;

    public Parallelepiped(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    @Override
    public double area() {
        return 2 * (getA() * getB() + getA() * c + getB() * c);
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getA(), 2) + Math.pow(getB(), 2) + Math.pow(c, 2));
    }

    @Override
    public double getVolume() {
        return getA() * getB() * c;
    }

    @Override
    public String toString() {
        return "The parallelepiped with side " + getA() + ", " + getB() + ", " + getC() + ":\n"
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