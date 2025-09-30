package Medium2;

import java.util.Scanner;

public class Player {
    String[][] field;
    String name;
    int a;
    int b;


    public Player(int a, int b, String name, String[][] field) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.field = field;
    }

    public String scanName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        name = scanner.next();
        return name;
    }

    public String printName (String name) {
        return name;
    }

    public int[] scanIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер ячейки, " + name);
        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;
        while (a < 0 || a > 2 || b < 0 || b > 2 || field[a][b] != null) {
            System.out.println("Введите корретный номер ячейки, " + name);
            a = scanner.nextInt() - 1;
            b = scanner.nextInt() - 1;
        }
        int[] index = new int[2];
        index[0] = a;
        index[1] = b;
        return index;
    }

}
