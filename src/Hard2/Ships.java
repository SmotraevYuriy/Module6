package Hard2;

import javax.security.sasl.SaslClient;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Ships {
    int[][] fieldComp;
    int[][] fieldPlayer;

    public Ships(int[][] fieldComp, int[][] fieldPlayer) {
        this.fieldComp = fieldComp;
        this.fieldPlayer = fieldPlayer;
    }

    public int[][] Comp4Ship(int[][] fieldComp) {
        int a = new Random().nextInt(2);
        int b = 0;
        int c = 0;
        if (a == 0) {
            b = new Random().nextInt(7);
            c = new Random().nextInt(10);
            for (int i = b; i < b + 4; i++) {
                if (c == 0) {
                    fieldComp[c][i] = 1;
                    fieldComp[c + 1][i] = 2;
                } else if (c == 9) {
                    fieldComp[c][i] = 1;
                    fieldComp[c - 1][i] = 2;
                } else {
                    fieldComp[c][i] = 1;
                    fieldComp[c + 1][i] = 2;
                    fieldComp[c - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[i][b - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 4 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[i][b + 4] = 2;
                }
            }

        }
        if (a == 1) {
            b = new Random().nextInt(7);
            c = new Random().nextInt(10);
            for (int i = b; i < b + 4; i++) {
                if (c == 0) {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c + 1] = 2;
                } else if (c == 9) {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c - 1] = 2;
                } else {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c + 1] = 2;
                    fieldComp[i][c - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[b - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 4 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[b + 4][i] = 2;
                }
            }
        }
        return fieldComp;
    }


    public int[][] Comp3Ship(int[][] fieldComp) {
        int a = new Random().nextInt(2);
        int b = 0;
        int c = 0;
        if (a == 0) {
            b = new Random().nextInt(8);
            c = new Random().nextInt(10);
            while (fieldComp[c][b] == 1 || fieldComp[c][b] == 2 || fieldComp[c][b + 1] == 1 || fieldComp[c][b + 1] == 2 || fieldComp[c][b + 2] == 1 || fieldComp[c][b + 2] == 2) {
                b = new Random().nextInt(8);
                c = new Random().nextInt(10);
            }
            for (int i = b; i < b + 3; i++) {
                if (c == 0) {
                    fieldComp[c][i] = 1;
                    fieldComp[c + 1][i] = 2;
                } else if (c == 9) {
                    fieldComp[c][i] = 1;
                    fieldComp[c - 1][i] = 2;
                } else {
                    fieldComp[c][i] = 1;
                    fieldComp[c + 1][i] = 2;
                    fieldComp[c - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[i][b - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 3 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[i][b + 3] = 2;
                }
            }
        }
        if (a == 1) {
            b = new Random().nextInt(8);
            c = new Random().nextInt(10);
            while (fieldComp[b][c] == 1 || fieldComp[b][c] == 2 || fieldComp[b + 1][c] == 1 || fieldComp[b + 1][c] == 2 || fieldComp[b + 2][c] == 1 || fieldComp[b + 2][c] == 2) {
                b = new Random().nextInt(8);
                c = new Random().nextInt(10);
            }
            for (int i = b; i < b + 3; i++) {
                if (c == 0) {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c + 1] = 2;
                } else if (c == 9) {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c - 1] = 2;
                } else {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c + 1] = 2;
                    fieldComp[i][c - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[b - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 3 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[b + 3][i] = 2;
                }
            }
        }
        return fieldComp;
    }

    public int[][] Comp2Ship(int[][] fieldComp) {
        int a = new Random().nextInt(2);
        int b = 0;
        int c = 0;
        if (a == 0) {
            b = new Random().nextInt(9);
            c = new Random().nextInt(10);
            while (fieldComp[c][b] == 1 || fieldComp[c][b] == 2 || fieldComp[c][b + 1] == 1 || fieldComp[c][b + 1] == 2) {
                b = new Random().nextInt(9);
                c = new Random().nextInt(10);
            }
            for (int i = b; i < b + 2; i++) {
                if (c == 0) {
                    fieldComp[c][i] = 1;
                    fieldComp[c + 1][i] = 2;
                } else if (c == 9) {
                    fieldComp[c][i] = 1;
                    fieldComp[c - 1][i] = 2;
                } else {
                    fieldComp[c][i] = 1;
                    fieldComp[c + 1][i] = 2;
                    fieldComp[c - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[i][b - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 2 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[i][b + 2] = 2;
                }
            }
        }
        if (a == 1) {
            b = new Random().nextInt(9);
            c = new Random().nextInt(10);
            while (fieldComp[b][c] == 1 || fieldComp[b][c] == 2 || fieldComp[b + 1][c] == 1 || fieldComp[b + 1][c] == 2) {
                b = new Random().nextInt(9);
                c = new Random().nextInt(10);
            }
            for (int i = b; i < b + 2; i++) {
                if (c == 0) {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c + 1] = 2;
                } else if (c == 9) {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c - 1] = 2;
                } else {
                    fieldComp[i][c] = 1;
                    fieldComp[i][c + 1] = 2;
                    fieldComp[i][c - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[b - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 2 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldComp[b + 2][i] = 2;
                }
            }
        }
        return fieldComp;
    }

    public int[][] Comp1Ship(int[][] fieldComp) {
        int b = 0;
        int c = 0;
        b = new Random().nextInt(10);
        c = new Random().nextInt(10);
        while (fieldComp[c][b] == 1 || fieldComp[c][b] == 2) {
            b = new Random().nextInt(10);
            c = new Random().nextInt(10);
        }
        if (c == 0) {
            fieldComp[c][b] = 1;
            fieldComp[c + 1][b] = 2;
        } else if (c == 9) {
            fieldComp[c][b] = 1;
            fieldComp[c - 1][b] = 2;
        } else {
            fieldComp[c][b] = 1;
            fieldComp[c + 1][b] = 2;
            fieldComp[c - 1][b] = 2;
        }

        for (int i = c - 1; i < c + 2; i++) {
            if (b - 1 < 0 || i < 0 || i > 9) {
                continue;
            } else {
                fieldComp[i][b - 1] = 2;
            }
        }
        for (int i = c - 1; i < c + 2; i++) {
            if (b + 1 > 9 || i < 0 || i > 9) {
                continue;
            } else {
                fieldComp[i][b + 1] = 2;
            }
        }
        return fieldComp;
    }


    public int[][] Player4Ship(int[][] fieldPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как будет размещаться ваш четырехпалубный корабль от стартовых координат, вниз или вправо?");
        String a = scanner.next();
        while (!a.equals("вниз") && !a.equals("вправо")) {
            System.out.println("Напишите, вправо или вниз?");
            a = scanner.next();
        }
        int b = 0;
        int c = 0;
        if (a.equals("вправо")) {
            System.out.println("Введите стартовые координаты");
            b = scanner.nextInt() - 1;
            c = scanner.nextInt() - 1;
            while (b < 0 || b > 6 || c < 0 || c > 9) {
                System.out.println("Введите корректные координаты");
                b = scanner.nextInt() - 1;
                c = scanner.nextInt() - 1;
            }
            for (int i = b; i < b + 4; i++) {
                if (c == 0) {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c + 1][i] = 2;
                } else if (c == 9) {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c - 1][i] = 2;
                } else {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c + 1][i] = 2;
                    fieldPlayer[c - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[i][b - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 4 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[i][b + 4] = 2;
                }
            }

        }
        if (a.equals("вниз")) {
            System.out.println("Введите стартовые координаты");
            c = scanner.nextInt() - 1;
            b = scanner.nextInt() - 1;
            while (b < 0 || b > 6 || c < 0 || c > 9) {
                System.out.println("Введите корректные координаты");
                c = scanner.nextInt() - 1;
                b = scanner.nextInt() - 1;
            }
            for (int i = b; i < b + 4; i++) {
                if (c == 0) {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c + 1] = 2;
                } else if (c == 9) {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c - 1] = 2;
                } else {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c + 1] = 2;
                    fieldPlayer[i][c - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[b - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 4 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[b + 4][i] = 2;
                }
            }
        }
        return fieldPlayer;
    }

    public int[][] Player3Ship(int[][] fieldPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как будет размещаться ваш трехпалубный корабль от стартовых координат, вниз или вправо?");
        String a = scanner.next();
        while (!a.equals("вниз") && !a.equals("вправо")) {
            System.out.println("Напишите, вправо или вниз?");
            a = scanner.next();
        }
        int b = 0;
        int c = 0;
        if (a.equals("вправо")) {
            System.out.println("Введите стартовые координаты");
            b = scanner.nextInt() - 1;
            c = scanner.nextInt() - 1;
            while (b < 0 || b > 7 || c < 0 || c > 9 || fieldPlayer[c][b] == 1 || fieldPlayer[c][b] == 2 || fieldPlayer[c][b + 1] == 1 || fieldPlayer[c][b + 1] == 2
                    || fieldPlayer[c][b + 2] == 1 || fieldPlayer[c][b + 2] == 2) {
                System.out.println("Введите корректные координаты");
                b = scanner.nextInt() - 1;
                c = scanner.nextInt() - 1;
            }
            for (int i = b; i < b + 3; i++) {
                if (c == 0) {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c + 1][i] = 2;
                } else if (c == 9) {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c - 1][i] = 2;
                } else {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c + 1][i] = 2;
                    fieldPlayer[c - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[i][b - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 3 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[i][b + 3] = 2;
                }
            }
        }
        if (a.equals("вниз")) {
            System.out.println("Введите стартовые координаты");
            c = scanner.nextInt() - 1;
            b = scanner.nextInt() - 1;
            while (b < 0 || b > 7 || c < 0 || c > 9 || fieldPlayer[b][c] == 1 || fieldPlayer[b][c] == 2 || fieldPlayer[b + 1][c] == 1 || fieldPlayer[b + 1][c] == 2
                    || fieldPlayer[b + 2][c] == 1 || fieldPlayer[b + 2][c] == 2) {
                System.out.println("Введите корректные координаты");
                c = scanner.nextInt() - 1;
                b = scanner.nextInt() - 1;
            }
            for (int i = b; i < b + 3; i++) {
                if (c == 0) {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c + 1] = 2;
                } else if (c == 9) {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c - 1] = 2;
                } else {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c + 1] = 2;
                    fieldPlayer[i][c - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[b - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 3 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[b + 3][i] = 2;
                }
            }
        }
        return fieldPlayer;
    }

    public int[][] Player2Ship(int[][] fieldPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как будет размещаться ваш двухпалубный корабль от стартовых координат, вниз или вправо?");
        String a = scanner.next();
        while (!a.equals("вниз") && !a.equals("вправо")) {
            System.out.println("Напишите, вправо или вниз?");
            a = scanner.next();
        }
        int b = 0;
        int c = 0;
        if (a.equals("вправо")) {
            System.out.println("Введите стартовые координаты");
            b = scanner.nextInt() - 1;
            c = scanner.nextInt() - 1;
            while (b < 0 || b > 8 || c < 0 || c > 9 || fieldPlayer[c][b] == 1 || fieldPlayer[c][b] == 2 || fieldPlayer[c][b + 1] == 1 || fieldPlayer[c][b + 1] == 2) {
                System.out.println("Введите корректные координаты");
                b = scanner.nextInt() - 1;
                c = scanner.nextInt() - 1;
            }
            for (int i = b; i < b + 2; i++) {
                if (c == 0) {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c + 1][i] = 2;
                } else if (c == 9) {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c - 1][i] = 2;
                } else {
                    fieldPlayer[c][i] = 1;
                    fieldPlayer[c + 1][i] = 2;
                    fieldPlayer[c - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[i][b - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 2 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[i][b + 2] = 2;
                }
            }
        }
        if (a.equals("вниз")) {
            System.out.println("Введите стартовые координаты");
            c = scanner.nextInt() - 1;
            b = scanner.nextInt() - 1;
            while (b < 0 || b > 8 || c < 0 || c > 9 || fieldPlayer[b][c] == 1 || fieldPlayer[b][c] == 2 || fieldPlayer[b + 1][c] == 1 || fieldPlayer[b + 1][c] == 2) {
                System.out.println("Введите корректные координаты");
                c = scanner.nextInt() - 1;
                b = scanner.nextInt() - 1;
            }
            for (int i = b; i < b + 2; i++) {
                if (c == 0) {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c + 1] = 2;
                } else if (c == 9) {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c - 1] = 2;
                } else {
                    fieldPlayer[i][c] = 1;
                    fieldPlayer[i][c + 1] = 2;
                    fieldPlayer[i][c - 1] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b - 1 < 0 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[b - 1][i] = 2;
                }
            }
            for (int i = c - 1; i < c + 2; i++) {
                if (b + 2 > 9 || i < 0 || i > 9) {
                    continue;
                } else {
                    fieldPlayer[b + 2][i] = 2;
                }
            }
        }
        return fieldPlayer;
    }

    public int[][] Player1Ship(int[][] fieldPlayer) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        int c = 0;
            System.out.println("Введите координаты однопалубного корабля");
            b = scanner.nextInt() - 1;
            c = scanner.nextInt() - 1;
        while (b < 0 || b > 9 || c < 0 || c > 9 || fieldPlayer[c][b] == 1 || fieldPlayer[c][b] == 2) {
            System.out.println("Введите корректные координаты");
            b = scanner.nextInt() - 1;
            c = scanner.nextInt() - 1;
        }
        if (c == 0) {
            fieldPlayer[c][b] = 1;
            fieldPlayer[c + 1][b] = 2;
        } else if (c == 9) {
            fieldPlayer[c][b] = 1;
            fieldPlayer[c - 1][b] = 2;
        } else {
            fieldPlayer[c][b] = 1;
            fieldPlayer[c + 1][b] = 2;
            fieldPlayer[c - 1][b] = 2;
        }

        for (int i = c - 1; i < c + 2; i++) {
            if (b - 1 < 0 || i < 0 || i > 9) {
                continue;
            } else {
                fieldPlayer[i][b - 1] = 2;
            }
        }
        for (int i = c - 1; i < c + 2; i++) {
            if (b + 1 > 9 || i < 0 || i > 9) {
                continue;
            } else {
                fieldPlayer[i][b + 1] = 2;
            }
        }
        return fieldPlayer;
    }

}
