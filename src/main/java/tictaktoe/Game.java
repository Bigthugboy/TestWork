package tictaktoe;

import java.util.Scanner;

import static tictaktoe.Gameboard.printGameBoard;
import static tictaktoe.Placement.*;
import static tictaktoe.Winner.winner;

public class Game {
    private Game game = new Game();
    private static Placement placement = new Placement();
    private static Winner winner = new Winner();
    private Gameboard gameboard = new Gameboard();
    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};

        System.out.println("welcome to tictactoe game");
        System.out.println("player1 = X");
        System.out.println("player2 = O");
        System.out.println("player1 turn");

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter a number between 1-9");
            int playerPosition = input.nextInt();
            while (player1position.contains(playerPosition) || player2position.contains(player1position)) {
                System.out.println("dem don play there, go where road clear before you collect wotowoto");
                playerPosition = input.nextInt();
            }

            placement(gameBoard, playerPosition, "player1");



            String result = winner();
            if (result.length() > 0) {
                System.out.println(result);

            }


            Scanner scan = new Scanner(System.in);

            System.out.println("player 2 turn");

             playerPosition = scan.nextInt();

            while (player2position.contains(playerPosition) || player2position.contains(player1position)) {

                System.out.println("dem don play there, go where road clear before you collect wotowoto");

                playerPosition = scan.nextInt();
            }
            placement(gameBoard, playerPosition, "player2");


            printGameBoard(gameBoard);

            result = winner();
            if (result.length() > 0) {
                System.out.println(result);


            }
        }
    }

    }

