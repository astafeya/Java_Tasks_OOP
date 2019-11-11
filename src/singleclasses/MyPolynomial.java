package singleclasses;

import java.util.Objects;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];
        for (int i = 0; i < this.coeffs.length; i++) {
            this.coeffs[i] = coeffs[i];
        }
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = coeffs.length - 1; i > 0; i--) {
            result += coeffs[i] + "x^" + i + " + ";
        }
        result += coeffs[0];
        return result;
    }

    public double evaluate(double x) {
        double result = coeffs[0];
        for (int i = 1; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int length = (this.coeffs.length > right.coeffs.length)? this.coeffs.length : right.coeffs.length;
        double[] answerCoeffs = new double[length];
        int minLength = (this.coeffs.length < right.coeffs.length)? this.coeffs.length : right.coeffs.length;

        for (int i = 0; i < minLength; i++) {
            answerCoeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.coeffs.length > minLength) {
            for (int i = minLength; i < length; i++) {
                answerCoeffs[i] = this.coeffs[i];
            }
        }
        else if (right.coeffs.length > minLength) {
            for (int i = minLength; i < length; i++) {
                answerCoeffs[i] = right.coeffs[i];
            }
        }

        MyPolynomial answer = new MyPolynomial(answerCoeffs);
        return answer;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int length = this.coeffs.length + right.coeffs.length;
        double[] answerCoeffs = new double[length];
        for (int i = 0; i < length; i++) {
            answerCoeffs[i] = 0;
        }

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                answerCoeffs[i+j] = this.coeffs[i] * right.coeffs[j];
            }
        }

        MyPolynomial answer = new MyPolynomial(answerCoeffs);
        return answer;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyPolynomial)) {
            return false;
        }
        MyPolynomial polynomial = (MyPolynomial) obj;
        if (coeffs.length != polynomial.coeffs.length) {
            return false;
        }
        for (int i = 0; i < coeffs.length; i++) {
            if (coeffs[i] != polynomial.coeffs[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int code = 17;
        for (int i = 0; i < coeffs.length; i++) {
            code = 31 * code + Objects.hashCode(coeffs[i]);
        }
        return code;
    }
}
