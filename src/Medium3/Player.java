package Medium3;

import java.util.Scanner;

public class Player {
    String name;
    int a;
    int b;

    public Player(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public String ScanName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        name = scanner.next();
        return name;
    }

    public String printName(String  name) {
        return name;
    }

    public int ScanIndex(int b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, сколько палочек убрать, 1, 2 или 3, " + printName(name));
        a = scanner.nextInt();
        while (a < 1 || a > 3) {
            System.out.println("Введите корретное количество палочек, " + printName(name));
            a = scanner.nextInt();
        }
        if (b == 3) {
            while (a < 1 || a > 2) {
                System.out.println("Введите корретное количество палочек, " + printName(name));
                a = scanner.nextInt();
            }
        }
        if (b == 2) {
            while (a != 1) {
                System.out.println("Введите корретное количество палочек, " + printName(name));
                a = scanner.nextInt();
            }
        }
        return a;
    }
}
