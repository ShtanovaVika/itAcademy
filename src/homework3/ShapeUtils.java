package homework3;

public class ShapeUtils {
     public static boolean itIsTriandle(GeometricFigures figure) {
        return figure.amountSide() == 3;
    }

     public static boolean itIsRectangle(GeometricFigures figure) {
        return figure.amountSide() == 4;
    }
}
