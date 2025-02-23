package calculator.operation;

import calculator.Calculator;

public class Multiplication extends Calculator {

    public Multiplication(double a, char operation, double b) {
        super(a, operation, b);
    }

    @Override
    public double calculate() {
        return getA() * getB();
    }
}