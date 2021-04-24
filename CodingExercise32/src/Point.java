public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double distance = Math.sqrt(((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y)));
        return distance;
    }

    public double distance(int x, int y){
        double distance = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
        return distance;
    }

    public double distance(Point another){
        double distance = Math.sqrt(((this.x - another.getX()) * (this.x - another.getX())) + ((this.y - another.getY()) * (this.y - another.getY())));
        return distance;
    }
}
