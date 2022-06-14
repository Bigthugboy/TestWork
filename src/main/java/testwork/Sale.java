package testwork;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        System.out.println("enter price of item sold " + name);

        int price;
        double total = 0;
        double profit ;
        for (int i = 0; i < 5; i++) {

            System.out.println("item price or -1 to exit");
            price = input.nextInt();
            total += price ;

        }
        profit =( total * 9) / 100 + 200;
        System.out.println(profit + " ");


        }




    }

