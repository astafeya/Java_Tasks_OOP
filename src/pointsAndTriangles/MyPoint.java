package pointsAndTriangles;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
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

    public int[] getXY() {
        int[] result = new int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        double answer = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return answer;
    }

    public double distance(MyPoint another) {
        double answer = Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
        return answer;
    }

    public double distance() {
        double answer = Math.sqrt(Math.pow((this.x), 2) + Math.pow((this.y), 2));
        return answer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyPoint)) {
            return false;
        }
        MyPoint point = (MyPoint) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + x;
        code = 31 * code + y;
        return code;
    }
}
