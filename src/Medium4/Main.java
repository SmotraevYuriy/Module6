package Medium4;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int count1 = 0;
        int count2 = 0;
        String replay = "";
        String[] names = new String[2];
        Player player = new Player(names, a);
        Game game = new Game(a, b, c);
        player.scanName();
        while (!replay.equals("нет")) {
            c = 0;
            b = game.computer(b);
            while (true) {
                a = player.scanIndex1();
                c = game.player(a, c);
                if (c > b) {
                    System.out.println("Проиграл " + player.printName1());
                    count2 = player.count2(count2);
                    break;
                }
                a = player.scanIndex2();
                c = game.player(a, c);
                if (c > b) {
                    System.out.println("Проиграл " + player.printName2());
                    count1 = player.count1(count1);
                    break;
                }

            }
            replay = game.replay();
        }
        if (count1 > count2) {
            System.out.println("Победил " + player.printName1() + " , побед: " + count1);
        } else if (count2 > count1) {
            System.out.println("Победил " + player.printName2() + " , побед: " + count2);
        } else {
            System.out.println("Ничья");
        }
    }
}
