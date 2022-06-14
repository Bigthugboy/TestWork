package testwork;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t\t" + "N2\t\t" + "N3\t\t" + "N4\t\t");
        for (int i = 1; i < 5; i++) {
            System.out.println();

            for (int j = 1; j < 5; j++) {
                double number = Math.pow(i, j);
                System.out.print(number + "\t\t ");


            }

        }
    }
}
