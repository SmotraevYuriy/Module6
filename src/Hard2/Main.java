package Hard2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean a;
        String[][] fieldPlayerPrint = new String[10][10];
        int[][] fieldComp = new int[10][10];
        int[][] fieldPlayer = new int[10][10];
        Fields fields = new Fields();
        fieldPlayer = fields.playerField();
        fieldComp = fields.compField();
        fieldPlayerPrint = fields.fieldForPlayer();
        Ships ships = new Ships(fieldComp, fieldPlayer);
        fieldComp = ships.comp4Ship(fieldComp);
        fieldComp = ships.comp3Ship(fieldComp);
        fieldComp = ships.comp3Ship(fieldComp);
        fieldComp = ships.comp2Ship(fieldComp);
        fieldComp = ships.comp2Ship(fieldComp);
        fieldComp = ships.comp2Ship(fieldComp);
        fieldComp = ships.comp1Ship(fieldComp);
        fieldComp = ships.comp1Ship(fieldComp);
        fieldComp = ships.comp1Ship(fieldComp);
        fieldComp = ships.comp1Ship(fieldComp);
        //fields.PrintCompField(fieldComp);
        fieldPlayer = ships.player4Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player3Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player3Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player2Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player2Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player2Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.printPlayerField(fieldPlayerPrint);
        Game game = new Game(fieldPlayer, fieldComp);
        System.out.println("Начинается игра, первым ходит игрок");
        while (true) {
            fieldComp = game.playerMove(fieldComp);
            a = game.playerWin(fieldComp);
            if (a) {
                System.out.println("Вы победили");
                break;
            }
            fieldPlayer = game.compMove(fieldPlayer);
            fieldPlayerPrint = fields.fieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
            fields.printPlayerField(fieldPlayerPrint);
            a = game.compWin(fieldPlayer);
            if (a) {
                System.out.println("Компьютер победили");
                break;
            }
        }
    }
}
