package Medium2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        String[][] field = new String[3][3];
        String name = null;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        int a = 0;
        int b = 0;
        int[] index = new int[2];
        Player player = new Player(a, b, name, field);
        name = player.ScanName();
        while (!c && !d && !e) {
            index = player.ScanIndex();
            a = index[0];
            b = index[1];
            Game game = new Game(a, b, c, d, e, field);
            field[a][b] = game.Player();
            e = game.Draw();
            c = game.WinnerX();
            if (e && c) {
                game.Field();
                System.out.println("Победил " +player.printName(name));
            }
            if (e) {
                game.Field();
                System.out.println("Ничья");
            } else {
                game.Computer();
                game.Field();
                c = game.WinnerX();
                d = game.Winner0();
            }
        }
        if (c) {
            System.out.println("Победил " + player.printName(name));
        } else if (d) {
            System.out.println("Победил компьютер");

        }
    }
}
