package singleClasses;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + this.radius + ", color = " + this.color + "]";
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) obj;
        return radius == circle.radius && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + (int)radius;
        code = 31 * code + color.hashCode();
        return  code;
    }
}
