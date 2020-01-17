public class Square {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Square(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public double getArea() {
        return pointA.distance(pointB) * pointA.distance(pointB);
    }

    public double getPerimeter() {
        return (double)pointA.distance(pointB) + 
        pointB.distance(pointC) + 
        pointC.distance(pointD) + 
        pointD.distance(pointA);
    }
}