package ProblemSolving;

public class Countdigits {

    public static void main(String[] args) {
       System.out.println( countDigit(10000));
    }

    static int countDigit(int n){
        int num= Math.abs(n);  // for handling negative values
        return String.valueOf(num).length();
    }
}
