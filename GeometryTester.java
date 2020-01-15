public class GeometryTester {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(14, 13), new Point(23, 46), new Point(52, 31));

        System.out.println("The area of the triangle is: " + triangle1.getArea());
    }
}