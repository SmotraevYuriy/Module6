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
        player.ScanName();
        while (!replay.equals("нет")) {
            c = 0;
            b = game.Computer(b);
            while (true) {
                a = player.ScanIndex1();
                c = game.Player(a, c);
                if (c > b) {
                    System.out.println("Проиграл " + player.printName1());
                    count2 = player.Count2(count2);
                    break;
                }
                a = player.ScanIndex2();
                c = game.Player(a, c);
                if (c > b) {
                    System.out.println("Проиграл " + player.printName2());
                    count1 = player.Count1(count1);
                    break;
                }

            }
            replay = game.Replay();
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
