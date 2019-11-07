package singleClasses;

public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle[length = " + this.length + ", width = " + this.width + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + (int)length;
        code = 31 * code + (int)width;
        return code;
    }
}
