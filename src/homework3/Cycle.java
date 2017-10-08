package homework3;

public class Cycle extends Circle implements OtherArea, Volume {

    private double h;

    public Cycle(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getBaseArea() {
        return 2 * NUMBER_PI * Math.pow(getA(), 2);
    }

    @Override
    public double getAreaSide() {
        return 2 * NUMBER_PI * getA() * h;
    }

    @Override
    public double area() {
        return 2 * getBaseArea() + getAreaSide();
    }

    @Override
    public double getVolume() {
        return NUMBER_PI * Math.pow(getA(), 2) * h;
    }

    @Override
    public String toString() {
        return "The cycle with radius " + getA() + " and height " + getH() + ":\n"
                + "1. base area = " + getAreaSide() + "\n"
                + "2. area side = " + getBaseArea() + "\n"
                + "3. area = " + area() + "\n"
                + "4. volume = " + getVolume() + "\n";
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
