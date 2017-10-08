package homework3;

public abstract class GeometricFigures {

    private double a;

    public GeometricFigures(double a) {
         this.a = a;
    }

    public double getA() {
        return a;
    }

    public abstract double area();

    public abstract boolean equalsArea(GeometricFigures n);

    public abstract int amountSide();
}