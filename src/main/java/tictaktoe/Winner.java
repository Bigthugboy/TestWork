package tictaktoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static tictaktoe.Placement.player1position;
import static tictaktoe.Placement.player2position;

public class Winner {

    private Placement placement = new Placement();


    public static String winner(){

        List<Integer> topRow = Arrays.asList(1,2,3);

        List<Integer> middleRow = Arrays.asList(4,5,6);

        List<Integer> bottomRow = Arrays.asList(7,8,9);

        List<Integer> leftcol= Arrays.asList(1,4,7);

        List<Integer> middlecol= Arrays.asList(2,5,8);

        List<Integer> rightcol= Arrays.asList(3,6,9);

        List<Integer> cross1 = Arrays.asList(1,5,9);

        List<Integer> cross2 = Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<List>();

        winning.add(topRow);

        winning.add(middleRow);

        winning.add(bottomRow);

        winning.add(leftcol);

        winning.add(middlecol);

        winning.add(rightcol);

        winning.add(cross1);

        winning.add(cross2);


        for (List win : winning){

            if(player1position.containsAll(win)){
                System.out.println("congratulation player 1, you won  . this other player no sabi");
                break;



            }else if(player2position.containsAll(win)){
                System.out.println("congratulation player 2, you won  . this other player no sabi");
                break;

            }else if(player1position.size()+ player2position.size() == 9){
                System.out.println("una two head no correct");
            }


        }





        return " ";
    }

}




