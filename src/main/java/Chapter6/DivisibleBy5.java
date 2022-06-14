package Chapter6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {

        System.out.println("enter a number from 1 to 10");
        int number = 0;
        int isDivisible = 5;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            try {
                number = input.nextInt();
            } catch (ArithmeticException exception) {

                if (number % isDivisible == 0) {
                    System.out.println("true");
                } else
                    System.out.println("false");
            }
            System.out.println(number);


        }
    }
}

