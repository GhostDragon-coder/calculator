package calculator.operation;

import calculator.Calculator;

public class Addition extends Calculator {

    public Addition(double a, char operation, double b) {
        super(a, operation, b);
    }

    @Override
    public double calculate() {
        return getA() + getB();
    }
}
