package org.academiadecodigo.bootcamp22.tictactoe;
import java.util.Scanner;

public class GameHelper {


        public static int userInput() {

            int i = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Where do you want to place your guess?");

            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                // sc.close(); //Encerra o programa
                return value;
            }

            // sc.close(); //Encerra o programa
            return 0;
        }



}

