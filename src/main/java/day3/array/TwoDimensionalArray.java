package day3.array;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        String [][] twoDimensionalArray = new String[8][8];

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                twoDimensionalArray[x][y] = y + "" + x;
            }
            System.out.println();
        }



        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(twoDimensionalArray[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
