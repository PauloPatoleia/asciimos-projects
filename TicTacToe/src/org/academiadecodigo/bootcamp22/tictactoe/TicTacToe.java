package org.academiadecodigo.bootcamp22.tictactoe;

public class TicTacToe {

    private static String[] gameStage = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};

    public static void printStage() {

        System.out.print(gameStage[0] + " ");
        System.out.print(gameStage[1]+ " ");
        System.out.println(gameStage[2]+ " ");
        System.out.print(gameStage[3]+ " ");
        System.out.print(gameStage[4]+ " ");
        System.out.println(gameStage[5]+ " ");
        System.out.print(gameStage[6]+ " ");
        System.out.print(gameStage[7]+ " ");
        System.out.println(gameStage[8]+ " ");

    }

    public static void start() {

        printStage();


        boolean currentPlayer = true;

        int i = 0;
        while(i < 6) {

            // get input

            int input = GameHelper.userInput();

            // change map
            gameStage[input] = currentPlayer ? "X" : "#";
            currentPlayer = !currentPlayer;

            // print updated map
            printStage();

            // check if anyone won

            i++;
        }




    }

    public static void checkWinner() {

    }

}
