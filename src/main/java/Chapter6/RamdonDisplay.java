package Chapter6;


import java.util.Random;


public class RamdonDisplay {
    public static void main(String[] args) {
        int[][] number = new int[3][3];

        Random num = new Random();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                number[i][j] = num.nextInt(9) + 1;
                System.out.print(number[i][j] + " ");

            }
            System.out.println();
        }
    }
}
