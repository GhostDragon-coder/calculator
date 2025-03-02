package calculator;

import calculator.operation.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator addition = new Addition(5, '+', 3);
        assertEquals(8, addition.calculate(), 0.0001);
    }

    @Test
    public void testSubtraction() {
        Calculator subtraction = new Subtraction(5, '-', 3);
        assertEquals(2, subtraction.calculate(), 0.0001);
    }

    @Test
    public void testMultiplication() {
        Calculator multiplication = new Multiplication(5, '*', 3);
        assertEquals(15, multiplication.calculate(), 0.0001);
    }

    @Test
    public void testDivision() {
        Calculator division = new Division(6, '/', 3);
        assertEquals(2, division.calculate(), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        Calculator division = new Division(5, '/', 0);
        Exception exception = assertThrows(ArithmeticException.class, division::calculate);
        assertEquals("Деление на ноль!", exception.getMessage());
    }
}
