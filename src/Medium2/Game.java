package Medium2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    String[][] field;
    int a;
    int b;
    boolean c;
    boolean d;
    boolean e;

    public Game(int a, int b, boolean c, boolean d, boolean e, String[][] field) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.field = field;
    }

    public String Computer() {
        a = Math.abs(new Random().nextInt(3));
        b = Math.abs(new Random().nextInt(3));
        while (field[a][b] != null) {
            a = Math.abs(new Random().nextInt(3));
            b = Math.abs(new Random().nextInt(3));
        }
        field[a][b] = "0";
        return field[a][b];
    }

    public String Player() {
        field[a][b] = "X";
        return field[a][b];
    }

    public void Field() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean WinnerX() {
        for (int i = 0; i < field.length; i++) {
            int x = 0;
            int y = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != null && field[i][j].equals("X")) {
                    x++;
                }
                if (field[j][i] != null && field[j][i].equals("X")) {
                    y++;
                }
                if (x == 3 || y == 3) {
                    c = true;
                }
            }
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != null && field[i][i].equals("X")) {
                a++;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] != null && field[i][field.length - 1 - i].equals("X")) {
                b++;
            }
        }
        if (a == 3 || b == 3) {
            c = true;
        }
        return c;
    }

    public boolean Winner0() {
        for (int i = 0; i < field.length; i++) {
            int x = 0;
            int y = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != null && field[i][j].equals("0")) {
                    x++;
                }
                if (field[j][i] != null && field[j][i].equals("0")) {
                    y++;
                }
                if (x == 3 || y == 3) {
                    d = true;
                }
            }
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != null && field[i][i].equals("0")) {
                a++;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] != null && field[i][field.length - 1 - i].equals("0")) {
                b++;
            }
        }
        if (a == 3 || b == 3) {
            d = true;
        }
            return d;
    }

    public boolean Draw() {
        int x = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != null) {
                    x++;
                }
            }
        }
        if (x == 9) {
            e = true;
        }
        return e;
    }

}
