package ProblemSolving;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(revInt(4321));
    }

    static int revInt(int n){
        int rev =0;
        int temp= n;

        while (n>0){
            int digit = n % 10;
            rev = rev *10 + digit;
            n/=10;

        }
        return rev;
    }
}
