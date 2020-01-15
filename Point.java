public class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double GetX() {
        return x;
    }

    public double GetY() {
        return y;
    }

    public double GetDistance(Point pointB) {
        double distance;
        distance = Math.abs(Math.sqrt((pointB.GetX() - x) * (pointB.GetX() - x) 
        + (pointB.GetY() - y) * (pointB.GetY() - y)));

        return distance;
    }
}