package calculator.operation;

import calculator.Calculator;

public class Division extends Calculator {

    public Division(double a, char operation, double b) {
        super(a, operation, b);
    }

    @Override
    public double calculate() {
        if (getB() == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return getA() / getB();
    }
}