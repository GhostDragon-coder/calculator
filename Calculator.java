package calculator;

public abstract class Calculator {
    private final double a;
    private final double b;
    private final char operation;

    public Calculator(double a, char operation, double b) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public abstract double calculate();

    @Override
    public String toString() {
        return STR."\{a} \{operation} \{b} = \{calculate()}";
    }
}
