package singleClasses;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = width + x;
        this.y2 = height - y;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y1 - y2;
    }

    public boolean collides(Ball ball) {
        if ((ball.getX() + ball.getRadius() <= x2) &&
                (ball.getX() - ball.getRadius() >= x1) &&
                (ball.getY() + ball.getRadius() <= y1) &&
                (ball.getY() - ball.getRadius() >= y2)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + ")]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Container)) {
            return false;
        }
        Container container = (Container) obj;
        return x1 == container.x1 && y1 == container.y1 && x2 == container.x2 && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + x1;
        code = 31 * code + y1;
        code = 31 * code + x2;
        code = 31 * code + y2;
        return code;
    }
}
