package Medium4;

import java.util.Scanner;

public class Player {
    String[] names;
    int a;

    public Player(String[] names, int a) {
        this.names = names;
        this.a = a;
    }

    public void ScanName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        names[0] = scanner.next();
        System.out.println("Введите имя второго игрока");
        names[1] = scanner.next();
    }

    public String printName1() {
        return names[0];
    }

    public String printName2() {
        return names[1];
    }

    public int ScanIndex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число , " + printName1());
        a = scanner.nextInt();
        while (a < 1) {
            System.out.println("Введите число , " + printName1());
            a = scanner.nextInt();
        }
        return a;
    }

    public int ScanIndex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число , " + printName2());
        a = scanner.nextInt();
        while (a < 1) {
            System.out.println("Введите число , " + printName2());
            a = scanner.nextInt();
        }
        return a;
    }

    public int Count1(int count1) {
        count1 = count1 + 1;
        return count1;
    }

    public int Count2(int count2) {
        count2 = count2 + 1;
        return count2;
    }
}
