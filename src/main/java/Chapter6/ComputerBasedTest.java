package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

import static Chapter6.CAI.random;

public class ComputerBasedTest {
    private static int question1;
    private static int question2;
    private static int answer;

    public static void question() {
        question1 = generateQuestion1();
        question2 = generateQuestion2();
        System.out.println("how much is " + question1 + " times " + question2 + " ? ");
    }

    public static void setAnswer(int answer) {
        answer = question1 * question2;
        ComputerBasedTest.answer = answer;
    }

    private static int generateQuestion2() {
        return random.nextInt(9) + 1;
    }

    private static int generateQuestion1() {
        return random.nextInt(9) + 1;
    }

    public static void continueAsking() {
        System.out.printf("How much is %d times %d: ", question1, question2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        question();
        int answer = scanner.nextInt();
        setAnswer(answer);
        int userInput;
        userInput = scanner.nextInt();

        while (userInput != answer) {
            System.out.println("Incorrect Answer. Try again!\n");
            continueAsking();
            answer = scanner.nextInt();
            setAnswer(answer);

            while (userInput == answer) {
                System.out.println("Correct!\n");
                question();
                answer = scanner.nextInt();
                setAnswer(answer);

            }

        }
    }
}
    
