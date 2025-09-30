package Medium2;

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
        name = player.scanName();
        while (!c && !d && !e) {
            index = player.scanIndex();
            a = index[0];
            b = index[1];
            Game game = new Game(a, b, c, d, e, field);
            field[a][b] = game.player();
            e = game.draw();
            c = game.winnerX();
            if (e && c) {
                game.field();
                System.out.println("Победил " +player.printName(name));
            }
            if (e) {
                game.field();
                System.out.println("Ничья");
            } else {
                game.computer();
                game.field();
                c = game.winnerX();
                d = game.winner0();
            }
        }
        if (c) {
            System.out.println("Победил " + player.printName(name));
        } else if (d) {
            System.out.println("Победил компьютер");

        }
    }
}
