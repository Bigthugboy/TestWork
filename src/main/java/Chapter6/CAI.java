package Chapter6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI {
    static final Scanner scanner = new Scanner(System.in);
    static SecureRandom random = new SecureRandom();


    public static void main(String[] args) {
        int counter = 1;
       int number1 = 1 + random.nextInt(9);
       int number2 = 1 + random.nextInt(9);

       int answer = number1 * number2;

       // printQuestion(number1, number2);

       while (true){
           printQuestion(number1, number2);

         int userInput = scanner.nextInt();
         counter++;

           if (userInput == answer) {
               System.out.println("Very good!!");
           }

           else {
               System.out.println("No please, try again!!");
               printQuestion(number1, number2);
           }


       }
    }

    public static void printQuestion(int number1, int number2){
        System.out.print("How much is "+ number1 +" times "+ number2 + ":");
    }

}
