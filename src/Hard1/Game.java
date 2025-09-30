package Hard1;

import java.util.Scanner;

public class Game {
    String[][] value;
    int[] array;
    String[] cards;

    public Game(int[] array, String[][] value, String[] cards) {
        this.array = array;
        this.value = value;
        this.cards = cards;
    }

    public int startComp() {
        int a = array[0];
        int b = array[1];
        int c = 0;
        int d = 0;
        for (int i = 0; i < value[0].length; i++) {
            if (cards[a].substring(0, cards[a].indexOf(' ')).equals(value[0][i])) {
                c = Integer.parseInt(value[1][i]);
            }
            if (cards[b].substring(0, cards[b].indexOf(' ')).equals(value[0][i])) {
                d = Integer.parseInt(value[1][i]);
            }
        }
        c = c + d;
        System.out.println("Компьютер взял 2 карты");
        return c;
    }

    public String[] cardsComp() {
        String[] cardsComp = new String[2];
        int a = array[0];
        int b = array[1];
        cardsComp[0] = cards[a];
        cardsComp[1] = cards[b];
        return cardsComp;
    }

    public int startPlayer() {
        Scanner scanner = new Scanner(System.in);
        int a = array[2];
        int b = array[3];
        int d = 0;
        int e = 0;
        for (int i = 0; i < value[0].length; i++) {
            if (cards[a].substring(0, cards[a].indexOf(' ')).equals(value[0][i])) {
                e = Integer.parseInt(value[1][i]);
            }
            if (cards[b].substring(0, cards[b].indexOf(' ')).equals(value[0][i])) {
                d = Integer.parseInt(value[1][i]);
            }
        }
        if (d == 11) {
            System.out.println("Сколько очков желаете за туз, 1 или 11?");
            d = scanner.nextInt();
            while (d !=1 && d != 11) {
                System.out.println("Введите корректное значение");
                d = scanner.nextInt();
            }
        }
        if (e == 11) {
            System.out.println("Сколько очков желаете за туз, 1 или 11?");
            e = scanner.nextInt();
            while (e !=1 && e != 11) {
                System.out.println("Введите корректное значение");
                e = scanner.nextInt();
            }
        }
        e = e + d;
        System.out.println("Ваши карты: " + cards[a] + ", " + cards[b] + ", сумма очков: " + e);
        return e;
    }

    public int addCard( int e, int j) {
        Scanner scanner = new Scanner(System.in);
        int a = array[j];
        int d = 0;
        for (int i = 0; i < value[0].length; i++) {
            if (cards[a].substring(0, cards[a].indexOf(' ')).equals(value[0][i])) {
                d = Integer.parseInt(value[1][i]);
            }
        }
        if (d == 11) {
            System.out.println("Сколько очков желаете за туз, 1 или 11?");
            d = scanner.nextInt();
            while (d !=1 && e != 11) {
                System.out.println("Введите корректное значение");
                d = scanner.nextInt();
            }
        }
        e = e + d;
        System.out.println("Ваша карта: " + cards[a] + ", сумма очков: " + e);
        return e;
    }
}
