package testwork;

import java.util.Scanner;

public class Tax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter monthly earning ");


        for (int i = 0; i < 3; i++) {
            double earning = input.nextDouble();

            double earnTax = (15 * earning) / 100;
           // double remainingEarning = earning - earnTax;
            double remainingEarning = 0;
            if (earning > 30000)
                remainingEarning = earning - earnTax;
                else
                    System.out.println("earning is lower than 30000");
                    earnTax += remainingEarning;




            System.out.println(remainingEarning + "  ");


        }
    }



}
