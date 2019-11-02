package singleClasses;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        if (real == 0.0) {
            return false;
        }
        return true;
    }

    public boolean isImaginary() {
        if (imag == 0.0) {
            return false;
        }
        return true;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real && this.imag == another.imag) {
            return true;
        }
        return false;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex result = new MyComplex(this.real+right.real, this.imag+right.imag);
        return result;
    }

    public MyComplex substract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right) {
        MyComplex result = new MyComplex(this.real-right.real, this.imag-right.imag);
        return result;
    }

    public MyComplex multiply(MyComplex right) {
        this.real *= right.real;
        this.imag *= right.imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real /= right.real;
        this.imag /= right.imag;
        return this;
    }

    public MyComplex conjugate() {
        MyComplex result = new MyComplex(this.real, -this.imag);
        return result;
    }
}
