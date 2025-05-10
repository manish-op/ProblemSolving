package ProblemSolving;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
        System.out.println(isPrime(19));
        System.out.println(isPrime(99));
    }

    static boolean isPrime(int n ){

        if(n<=1){
            return false;
        }

        int c=2;
        while(c*c<=n){
            if(n%c==0) {
                return false;
            }
            c++;
        }
        return c*c>n;
    }

}
