package testwork;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  student = 5 ;
        int aCOunt = 0;
        int bCount = 0;
        int cCount = 0;

        String grade;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter student grade");
            grade = input.nextLine();
            switch (grade.charAt(0)){
                case 'a':aCOunt++;
                case 4:
                    grade = "A";
                   // aCOunt++;
                    break;
                case 'c': cCount++;
                    grade = "C";


                    break;
                case 'b':

                case 5:bCount++;
                    grade ="B";

                    break;

            }


        }
        System.out.println("total number of grade enter is " + student);
        System.out.println("the total of student thta score A is " + aCOunt);
        System.out.println("the total number of student that score B is " + bCount);
        System.out.println("the total number of student that score C is " + cCount);

    }
}
