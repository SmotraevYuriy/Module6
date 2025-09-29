package Hard1;

import java.util.Arrays;
import java.util.Random;

public class Card {
    String[] nameCard;
    String[] suit;
    String[][] value;

    public Card() {
        nameCard  = new String[]{"шестерка", "семерка", "восьмерка", "девятка", "десятка", "валет", "дама", "король", "туз"};
        suit = new String[]{"червы", "пики", "бубны", "треф"};
        value = new String[][]{
                {"шестерка", "семерка", "восьмерка", "девятка", "десятка", "валет", "дама", "король", "туз"},
                {"6", "7", "8", "9", "10", "10", "10", "10", "11"}
        };
    }

    public String[][] Value() {
        return value;
    }

    public String[] Cards() {
        String[] cards = new String[36];
        int a = 0;
        for (int i = 0; i <nameCard.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                cards[a] = nameCard[i] + " " + suit[j];
                a++;
            }
        }
        return  cards;
    }

    public int[] Array() {
        int[] array = new int[36];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
            for (int j = array.length - 1; j > 0; j--) {
                int index = new Random().nextInt(j);
                int temp = array[index];
                array[index] = array[j];
                array[j] = temp;
            }

        return array;
    }



}
