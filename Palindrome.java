package ProblemSolving;

public class Palindrome {

        public static boolean isPalindrome(int x) {
            int temp=x;
            int rev=0;
//
            while(x>0){
                int digit = x % 10;
                rev = rev * 10 + digit;
                x /= 10;
            }
            return rev == temp;
        }

    public static void main(String[] args) {
        System.out.println(isPalindrome(129));
    }

}
