package Hard2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int[][] fieldPlayer;
    int[][] fieldComp;

    public Game(int[][] fieldPlayer, int[][] fieldComp) {
        this.fieldPlayer = fieldPlayer;
        this.fieldComp = fieldComp;
    }

    public int[][] CompMove(int[][] fieldPlayer) {
        int a = new Random().nextInt(10);
        int b = new Random().nextInt(10);
        while (fieldPlayer[a][b] == 4 || fieldPlayer[a][b] == 3) {
            a = new Random().nextInt(10);
            b = new Random().nextInt(10);
        }
        System.out.println("Компьютер выбрал координаты: Х = " + (b + 1) + ", Y = " + (a + 1));
        if (fieldPlayer[a][b] == 1) {
            boolean c;
            while (fieldPlayer[a][b] == 1) {
                fieldPlayer[a][b] = 3;
                c = true;
                for (int i = 0; i < fieldPlayer.length; i++) {
                    for (int j = 0; j < fieldPlayer.length; j++) {
                        if (fieldPlayer[i][j] == 1) {
                            c = false;
                        }
                    }
                }
                if(c) {
                    break;
                }
                a = new Random().nextInt(10);
                b = new Random().nextInt(10);
                while (fieldPlayer[a][b] == 4 || fieldPlayer[a][b] == 3) {
                    a = new Random().nextInt(10);
                    b = new Random().nextInt(10);
                }
                System.out.println("Компьютер попал, новые координаты: " + "Х = " + (b + 1) + ", Y = " + (a + 1));
                if (fieldPlayer[a][b] != 1) {
                    System.out.println("Компьютер не попал");
                    fieldPlayer[a][b] = 4;
                }
            }
        } else {
            System.out.println("Компьютер не попал, ваш ход");
            fieldPlayer[a][b] = 4;
        }
        return fieldPlayer;
    }

    public int[][] PlayerMove(int[][] fieldComp) {
        boolean c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты выстрела");
        int b = scanner.nextInt() - 1;
        int a = scanner.nextInt() - 1;
        while (a < 0 || a > 9 || b < 0 || b > 9) {
            System.out.println("Введите корректные координаты");
            b = scanner.nextInt();
            a = scanner.nextInt();
        }
        System.out.println("Ваши координаты: Х = " + (b + 1) + ", Y = " + (a + 1));
        if (fieldComp[a][b] != 1) {
            System.out.println("Вы не попали, ход компьютера");
        }
        if (fieldComp[a][b] == 1) {
            while (fieldComp[a][b] == 1) {
                fieldComp[a][b] = 3;
                c = true;
                for (int i = 0; i < fieldComp.length; i++) {
                    for (int j = 0; j < fieldComp.length; j++) {
                        if (fieldComp[i][j] == 1) {
                            c = false;
                        }
                    }
                }
                if (c) {
                    break;
                }
                System.out.println("Вы попали, введите новые координаты:");
                b = scanner.nextInt() - 1;
                a = scanner.nextInt() - 1;
                while (a < 0 || a > 9 || b < 0 || b > 9) {
                    System.out.println("Введите корректные координаты");
                    b = scanner.nextInt() - 1;
                    a = scanner.nextInt() - 1;
                }
                System.out.println("Ваши координаты: Х = " + (b + 1) + ", Y = " + (a + 1));
                if (fieldComp[a][b] != 1) {
                    System.out.println("Вы не попали, ход компьютера");
                }
            }
        }
        return fieldComp;
    }

    public boolean CompWin(int[][] fieldPlayer) {
        boolean a = true;
        for (int i = 0; i < fieldPlayer.length; i++) {
            for (int j = 0; j < fieldPlayer.length; j++) {
                if (fieldPlayer[i][j] == 1) {
                    a = false;
                }
            }
        }
        return a;
    }

    public boolean PlayerWin(int[][] fieldComp) {
        boolean a = true;
        for (int i = 0; i < fieldComp.length; i++) {
            for (int j = 0; j < fieldComp.length; j++) {
                if (fieldComp[i][j] == 1) {
                    a = false;
                }
            }
        }
        return a;
    }


}
