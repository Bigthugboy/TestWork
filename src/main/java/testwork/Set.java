package testwork;

import java.util.Arrays;

public class Set {
    public static void main(String[] args) {

        int addValue = 0;

                int[] set1 = {2, 2, 5, 5, 8, 9, 7, 10};
                int[] set2 = {1, 0, 6, 15, 6, 4, 7, 0};

                System.out.println("set1 : "+ Arrays.toString(set1));
                System.out.println("set2 : "+Arrays.toString(set2));

                for (int i = 0; i < set1.length; i++){


                    for (int j = 0; j < set2.length; j++){
                       

                        if(set1[i] == (set2[j])){

                            System.out.println("Common element is : "+(set1[i]));
                            addValue = addValue + (set1[i] * 2);
                        }

                         ;
                    }


                }

        System.out.println("the sum is : " + addValue);

            }
        }


