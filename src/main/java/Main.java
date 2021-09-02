import processing.core.PApplet;

public class Main extends PApplet {
    public static final int DIAMETER = 15;
    public static final int HEIGHT = 768;
    public static final int WIDTH = 1024;
    public Circle[] circles;

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        circles = new Circle[4];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(0, (i + 1) * HEIGHT / 5, DIAMETER, i + 1);
        }
    }

    @Override
    public void draw() {
        for (Circle circle : circles) {
            ellipse(circle.xAxis, circle.yAxis, circle.DIAMETER, circle.DIAMETER);
            circle.move();
        }
    }
}
