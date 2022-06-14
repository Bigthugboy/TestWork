package tictaktoe;

import java.util.ArrayList;

public class Placement {

    static ArrayList<Integer> player1position = new ArrayList<>();
    static ArrayList<Integer> player2position = new ArrayList<>();

    public static void placement(char [][] gameBoard,int Position,String user){

        char symbol = ' ';
        if(user.equals("player1")) {
            symbol = 'X';
            player1position.add(Position);
        }
        else
        if (user.equals("player2")) {
            symbol = 'O';
            player2position.add(Position);


        }
        switch (Position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;


        }
    }
}
