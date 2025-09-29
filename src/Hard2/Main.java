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
        fieldPlayer = fields.PlayerField();
        fieldComp = fields.CompField();
        fieldPlayerPrint = fields.FieldForPlayer();
        Ships ships = new Ships(fieldComp, fieldPlayer);
        fieldComp = ships.Comp4Ship(fieldComp);
        fieldComp = ships.Comp3Ship(fieldComp);
        fieldComp = ships.Comp3Ship(fieldComp);
        fieldComp = ships.Comp2Ship(fieldComp);
        fieldComp = ships.Comp2Ship(fieldComp);
        fieldComp = ships.Comp2Ship(fieldComp);
        fieldComp = ships.Comp1Ship(fieldComp);
        fieldComp = ships.Comp1Ship(fieldComp);
        fieldComp = ships.Comp1Ship(fieldComp);
        fieldComp = ships.Comp1Ship(fieldComp);
        //fields.PrintCompField(fieldComp);
        fieldPlayer = ships.Player4Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player3Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player3Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player2Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player2Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player2Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        fieldPlayer = ships.Player1Ship(fieldPlayer);
        fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
        fields.PrintPlayerField(fieldPlayerPrint);
        Game game = new Game(fieldPlayer, fieldComp);
        System.out.println("Начинается игра, первым ходит игрок");
        while (true) {
            fieldComp = game.PlayerMove(fieldComp);
            a = game.PlayerWin(fieldComp);
            if (a) {
                System.out.println("Вы победили");
                break;
            }
            fieldPlayer = game.CompMove(fieldPlayer);
            fieldPlayerPrint = fields.FieldForPlayerFull(fieldPlayerPrint, fieldPlayer);
            fields.PrintPlayerField(fieldPlayerPrint);
            a = game.CompWin(fieldPlayer);
            if (a) {
                System.out.println("Компьютер победили");
                break;
            }
        }
    }
}
