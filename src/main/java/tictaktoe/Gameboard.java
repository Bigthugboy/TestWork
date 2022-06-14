package tictaktoe;



public class Gameboard {

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {

            for (char column : row) {

                System.out.print(column);

            }
            System.out.println();

        }


    }
}