package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,1,2));
        System.out.println(pickingNumbers(list));

    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> countList = new ArrayList<>();
        int count =0;
        Collections.sort(a);
        //1 1 2 2 2 3
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                int diffValue = Math.abs(a.get(i)-a.get(j));
                System.out.print(diffValue+" ");

                if(diffValue<=1){
                    count++;
                }

            }

            countList.add(count);
            count=0;
        }

        int min = Integer.MIN_VALUE;
        for (int integer : countList) {
            if(integer>min){
                min=integer;
            }
        }

        return min+1;
    }
}
