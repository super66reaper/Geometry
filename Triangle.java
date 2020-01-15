public class Triangle{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC ){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double getArea(){
        double area;
        double base;
        double height;
        base = pointA.getDistance(pointB);
        height = pointA.getY() - pointC.getY();
        area = Math.abs((base * height) / 2);
        return area;
    }

}