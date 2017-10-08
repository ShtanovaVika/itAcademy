package homework3;

public class Ball extends Circle implements Volume {

    public Ball(double r) {
        super(r);
    }

    @Override
    public double area() {
        return 4 * NUMBER_PI * Math.pow(getA(), 2);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * NUMBER_PI * Math.pow(getA(), 3);
    }

    @Override
    public String toString() {
        return "The ball with a radius " + getA() + ":\n"
                + "1. area = " + area() + "\n"
                + "2. volume = " + getVolume() + "\n";
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