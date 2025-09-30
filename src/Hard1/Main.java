package Hard1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cardsComp = new String[2];
        String[] cards = new String[36];
        String[] nameCard = new String[9];
        String[] suit = new String[4];
        String[][] value = new String[9][9];
        int[] array = new int[36];
        int j = 4;
        int c = 0;
        int e = 0;
        String next = null;
        Card card = new Card();
        value = card.value();
        array = card.array();
        cards = card.cards();
        Game game = new Game(array, value, cards);
        c = game.startComp();
        cardsComp = game.cardsComp();
        e = game.startPlayer();
        if (e == 21) {
            System.out.println("Ваши очки: " + e + ", вы победили.");
        } else {
            System.out.println("Желаете взять ещё карту? (да/нет)");
            next = scanner.next();
            while (!next.equals("да") && !next.equals("нет")) {
                System.out.println("Введите да или нет");
                next = scanner.next();
            }
            if (next.equals("да")) {
                while (!next.equals("нет")) {
                    e = game.addCard( e, j);
                    j++;
                    if (e == 21) {
                        break;
                    }
                    if (e > 21) {
                        break;
                    }
                    System.out.println("Желаете взять ещё карту? (да/нет)");
                    next = scanner.next();
                    while (!next.equals("да") && !next.equals("нет")) {
                        System.out.println("Введите да или нет");
                        next = scanner.next();
                    }
                }
            }
            if (e == 21) {
                System.out.println("Ваши очки: " + e + ", вы победили.");
            } else if (e > 21) {
                System.out.println("Сумма очков больше 21, вы проиграли");
            } else if (c > e) {
                System.out.println("Сумма очков и карты компьютера: " + c + ", " + cardsComp[0] + ", " + cardsComp[1] + ", ваши очки: " + e + ", компьютер победил.");
            } else if (e > c) {
                System.out.println("Сумма очков и карты компьютера: " + c + ", " + cardsComp[0] + ", " + cardsComp[1] + ", ваши очки: " + e + ", вы победили.");
            } else {
                System.out.println("Сумма очков и карты компьютера: " + c + ", " + cardsComp[0] + ", " + cardsComp[1] + ", ваши очки: " + e + ", ничья.");
            }
        }
    }
}
