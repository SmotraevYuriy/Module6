package Medium1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие: +, -, *, / ");
        char iteration = scanner.next().charAt(0);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator();
        double result = 0;
        if (iteration == '+') {
            result = calculator.addition(a, b);
            System.out.println(result);
        } else if (iteration == '-') {
            result = calculator.subtraction(a, b);
        } else if (iteration == '*') {
            result = calculator.multiplication(a, b);
        } else if (iteration == '/') {
            result = calculator.division(a, b);
        }
        System.out.println(result);
    }
}
