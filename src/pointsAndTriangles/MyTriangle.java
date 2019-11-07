package pointsAndTriangles;

public class MyTriangle extends MyPoint{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle";
    }

    public double getPerimeter() {
        double perimeter;
        perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return perimeter;
    }

    public String getType() {
        String type = "Scalene";
        int typeNumber = 0;
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        if (side1 == side2 && side2 == side3) {
            type = "Equilateral";
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1) {
            type = "Isosceles";
        }

        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTriangle)) {
            return false;
        }
        MyTriangle triangle = (MyTriangle) obj;
        return this.v1.equals(triangle.v1) && this.v2.equals(triangle.v2) && this.v3.equals(triangle.v3);
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + v1.hashCode();
        code = 31 * code + v2.hashCode();
        code = 31 * code + v3.hashCode();
        return code;
    }
}
