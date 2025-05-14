package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class Recursion5 {
    public static void main(String[] args) {
        String str = "121";
        System.out.println(checkPalindrome(str, 0, str.length() - 1));


        for (int i = 1; i <= 10; i++) {
            System.out.print(findFibonacci(i)+" ");
        }



        //count freq
        int[] arr = {1,2,2,3,2,3,4,6,7,7,1};
        countFreq(arr);
    }

    static boolean checkPalindrome(String str, int start, int end) {

        if (start > end) {
            return false;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return true;

    }


    //to find the Nth Fibonacci number using recursion

    static int findFibonacci(int n){
        if(n==0) return 0;
        if (n==1) return 1;

        return findFibonacci(n-1)+findFibonacci(n-2);
    }

    // to count the frequency of each element in an array

    static void countFreq(int [] arr ){

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> count : map.entrySet()){
            System.out.println(count.getKey()+"-> " + count.getValue());
        }



    }

}
