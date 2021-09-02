public class Circle {
    public final int DIAMETER;
    public final int SPEED;
    public int xAxis;
    public int yAxis;

    public Circle(int xAxis, int yAxis, int diameter, int speed) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        DIAMETER = diameter;
        SPEED = speed;
    }

    public void move(){
        xAxis = xAxis + SPEED;
    }
}
