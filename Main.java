package calculator;

import calculator.operation.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();


        Calculator result = switch (operator) {
            case '+' -> new Addition(a, operator, b);
            case '-' -> new Subtraction(a, operator, b);
            case '*' -> new Multiplication(a, operator, b);
            case '/' -> new Division(a, operator, b);
            default -> throw new IllegalArgumentException(STR."Операция не поддерживается: \{operator}");
        };

        System.out.println(result);
        scanner.close();
    }
}
