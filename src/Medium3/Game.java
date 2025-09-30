package Medium3;

import java.util.Random;

public class Game {
    String[] field;
    int a;
    int b;

    public Game(String[] field, int a, int b) {
        this.field = field;
        this.a = a;
        this.b = b;
    }

    public int computer(int b) {
        a = Math.abs(new Random().nextInt(2) + 1);
        if (b == 3) {
            a = 2;
        } else if (b == 2) {
            a = 1;
        } else if (b == 4){
            a = 3;
        }
        b = b - a;
        System.out.println("Компьютер убрал " + a);
        return b;
    }

    public void field(int b) {
        for (int i = 0; i < b; i++) {
                System.out.print(field[i] + " ");
        }
        System.out.println();
        System.out.println("Осталось " + b + " палочек");
    }

    public int player(int a, int b) {
        b = b - a;
        return b;
    }
}
