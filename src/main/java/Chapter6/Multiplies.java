package Chapter6;

import java.util.Scanner;

public class Multiplies {
    public static void main(String[] args) {
        System.out.println("enter a number");
        int number = 0;
        int isMultiple ;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            number = input.nextInt();
            System.out.println("enter number to divide with");
            isMultiple = input.nextInt();
            if(number % isMultiple == 0 ){
                System.out.println("true");
            }
            else
                System.out.println("false");

        }
        System.out.println(number);
    }
}
