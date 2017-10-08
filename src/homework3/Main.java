package homework3;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println(square);
        Rectangle rectangle = new Rectangle(4, 4);
        System.out.println(rectangle);
        Triandle triandle = new Triandle(2, 3, 1, 2);
        System.out.println(triandle);
        Cone cone = new Cone(2, 1, 1, 3);
        System.out.println(cone);
        Circle circle = new Circle(5);
        System.out.println(circle);
        Ball ball = new Ball(5);
        System.out.println(ball);
        Cycle cycle = new Cycle(5, 5);
        System.out.println(cycle);
        Pyramid pyramid = new Pyramid(1, 2, 3, 4);
        System.out.println(pyramid);
        Cube cube = new Cube(5);
        System.out.println(cube);
        Parallelepiped parallelepiped = new Parallelepiped(4, 2, 3);
        System.out.println(parallelepiped);
        System.out.println("The areas is " + (triandle.equalsArea(cube) ? "equal" : " not equal"));
        System.out.println("The areas is " + (square.equalsArea(rectangle) ? "equal" : "not equal"));
        System.out.println("This is" + (ShapeUtils.itIsTriandle(parallelepiped) ? " a triangle" : " not a triangle"));
        System.out.println("This is" + (ShapeUtils.itIsTriandle(triandle) ? " a triangle" : " not a triangle"));
        System.out.println("This is" + (ShapeUtils.itIsRectangle(rectangle) ? " a rectangle" : " not a rectangle"));
        System.out.println("This is" + (ShapeUtils.itIsTriandle(ball) ? " a rectangle" : " not a rectangle"));
    }

}