public class GeometryTester {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(1, 1), new Point(2, 4), new Point(5, 3));

        System.out.println("The area of the triangle is: " + triangle1.getArea());
    }
}