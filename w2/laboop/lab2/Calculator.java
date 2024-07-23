package w2.laboop.lab2;

public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double minus(double first, double second) {
        return first - second;
    }

    public double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        } else {
            return first / second;
        }
    }

    public double multiply(double first, double second) {
        return first * second;
    }
}

