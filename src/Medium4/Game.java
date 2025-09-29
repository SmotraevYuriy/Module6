package Medium4;

import Medium3.Player;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int a;
    int b;
    int c;

    public Game(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int Computer(int b) {
        b = Math.abs(new Random().nextInt(99) + 1);
        System.out.println("Компьютер загадал число");
        return b;
    }

    public String Replay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите продолжить игру? Введите да или нет соответственно");
        String replay = scanner.next();
        while (!replay.equals("нет") && !replay.equals("да")) {
            System.out.println("Хотите продолжить игру? Введите да или нет соответственно");
            replay = scanner.next();
        }
        return replay;
    }

    public int Player(int a, int c) {
        c = c + a;
        return c;
    }


}
