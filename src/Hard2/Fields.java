package Hard2;

public class Fields {
    int[][] fieldComp;
    int[][] fieldPlayer;
    String[][] fieldPlayerPrint;

    public Fields() {
        fieldComp = new int[10][10];
        fieldPlayer = new int[10][10];
        this.fieldPlayerPrint = new String[10][10];
    }

    public String[][] FieldForPlayer() {
        for (int i = 0; i < fieldPlayerPrint.length; i ++) {
            for (int j = 0; j < fieldPlayerPrint.length; j++) {
                fieldPlayerPrint[i][j] = "O";
            }
        }
        return fieldPlayerPrint;
    }

    public String[][] FieldForPlayerFull(String[][] fieldPlayerPrint , int[][] fieldPlayer ) {
        for (int i = 0; i < fieldPlayerPrint.length; i ++) {
            for (int j = 0; j < fieldPlayerPrint.length; j++) {
                if (fieldPlayer[i][j] == 1) {
                    fieldPlayerPrint[i][j] = "V";
                }
                if (fieldPlayer[i][j] == 3) {
                    fieldPlayerPrint[i][j] = "X";
                }
            }
        }
        return fieldPlayerPrint;
    }

    public void PrintPlayerField(String  [][] fieldPlayerPrint) {
        for (int i = 0; i < fieldPlayerPrint.length; i ++) {
            for (int j = 0; j < fieldPlayerPrint.length; j++) {
                System.out.print(fieldPlayerPrint[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int[][] PlayerField() {
        for (int i = 0; i < fieldPlayer.length; i ++) {
            for (int j = 0; j < fieldPlayer.length; j++) {
                fieldPlayer[i][j] = 0;
            }
        }
        return fieldPlayer;
    }

    public int[][] CompField() {
        for (int i = 0; i < fieldComp.length; i ++) {
            for (int j = 0; j < fieldComp.length; j++) {
                fieldComp[i][j] = 0;
            }
        }
        return fieldComp;
    }

    public void PrintCompField(int [][] fieldComp) {
        for (int i = 0; i < fieldComp.length; i ++) {
            for (int j = 0; j < fieldComp.length; j++) {
                System.out.print(fieldComp[i][j] + "  ");
            }
            System.out.println();
        }
    }


}
