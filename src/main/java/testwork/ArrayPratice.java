package testwork;

public class ArrayPratice {
    public static void main(String[] args) {
        int [][] number = {{2,3},{2,4}};

        int total = 0;
        for (int row = 0; row < number.length ; row++) {
            for (int column = 0; column <number[row].length ; column++) {
                total += number[row][column];
                System.out.println(total);
            }
            
        }
    }
}
