package homework3;

public class Pyramid extends Triandle implements Volume, OtherArea {

    public Pyramid(double a, double h, double b, double c) {
        super(a, h, b, c);
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public double getBaseArea() {
        return Math.sqrt(3) / 4 * Math.pow(getA(), 2);
    }

    @Override
    public double getAreaSide() {
        return 1 / 2 * getPerimeter() * getH();
    }

    @Override
    public double area() {
        return getAreaSide() + getBaseArea();
    }

    @Override
    public double getVolume() {
        return 1 / 3 * getBaseArea() * getH();
    }

    @Override
    public String toString() {
        return "The pyramid with sides: " + getA() + ", " + getB() + ", " + getC() + " and height " + getH() + ":\n"
                + "1. perimeter = " + getPerimeter() + "\n"
                + "2. base area = " + getAreaSide() + "\n"
                + "3. area side = " + getBaseArea() + "\n"
                + "4. area = " + area() + "\n"
                + "5. volume = " + getVolume() + "\n";
    }

    @Override
    public boolean equalsArea(GeometricFigures figure) {
        return area() == figure.area();
    }

    @Override
    public int amountSide() {
        return 6;
    }
}