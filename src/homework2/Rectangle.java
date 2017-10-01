package homework2;

public class Rectangle {
    public Point upperLeft;
    public Point lowerRight;

    public Rectangle(double upperLeftX, double upperLeftY, double lowerRightX, double lowerRightY) {
        upperLeft = new Point(upperLeftX, upperLeftY);
        lowerRight = new Point(lowerRightX, lowerRightY);
    }

    public void areaRectangle() {
        System.out.format("Area rectangle  %.3f%n", (lowerRight.getX() - upperLeft.getX()) * (upperLeft.getY() - lowerRight.getY()));
    }

    public void diagonal() {
        System.out.format("Diagonal %.3f%n", lowerRight.distance(upperLeft));
    }
}
