package Medium3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] field = new String[20];
        int a = 0;
        int b = 20;
        Arrays.fill(field, "|");
        String name = null;
        Player player = new Player(a, b, name);
        Game game = new Game(field, a, b);
        name = player.ScanName();
        while(true) {
            a = player.ScanIndex(b);
            b = game.Player(a, b);
            if(b == 1) {
                System.out.println("Победил " + player.printName(name));
                break;
            }
            b = game.Computer(b);
            if (b == 1) {
                System.out.println("Победил компьютер");
                break;
            }
            game.Field(b);
        }
    }
}
