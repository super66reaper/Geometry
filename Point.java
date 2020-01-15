public class Point{
    private Vetor2 position;

    public Point(double x, double y) {
        position = new Vector2(x, y);
    }

    public Vector2 GetPosition() {
        return position;
    }

    public double GetX() {
        return position.x;
    }

    public double GetY() {
        return position.y;
    }

    public double GetDistance(Point pointB) {
        double distance;
        distance = Math.abs(Math.sqrt((pointB.GetX() - position.x) * (pointB.GetX() - position.x) 
        + (pointB.GetY() - position.y) * (pointB.GetY() - position.y)));

        return distance;
    }
}