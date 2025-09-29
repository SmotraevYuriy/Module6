package Medium1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие: +, -, *, / ");
        char iteration = scanner.next().charAt(0);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        Iterations iterations = new Iterations(a, b);
        double result = 0;
        if (iteration == '+') {
            result = iterations.addition();
            System.out.println(result);
        } else if (iteration == '-') {
            result = iterations.subtraction();
        } else if (iteration == '*') {
            result = iterations.multiplication();
        } else if (iteration == '/') {
            result = iterations.division();
        }
        System.out.println(result);
    }
}
