package ProblemSolving;

public class Pallindrome {

        public static boolean isPalindrome(int x) {
            int temp=x;
            int rev=0;

            while(x>0){
                rev = temp%10;
                x/=10;
            }
            if(rev==x)
                return true;
            else
                return false;
        }

    public static void main(String[] args) {
        isPalindrome(121);
    }

}
