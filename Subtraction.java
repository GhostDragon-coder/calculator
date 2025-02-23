package calculator.operation;

import calculator.Calculator;

public class Subtraction extends Calculator {

    public Subtraction(double a, char operation, double b) {
        super(a, operation, b);
    }

    @Override
    public double calculate() {
        return getA() - getB();
    }
}