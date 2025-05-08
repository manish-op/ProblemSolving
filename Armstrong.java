package ProblemSolving;

public class Armstrong {

    public static void main(String[] args) {
        System.out.print(isArmstrong(153));
    }

    static boolean isArmstrong(int n ){

        int temp =n;
        int sum =0;
        int rev=0;

        while(n>0){

          int  digit = n%10 ;
          sum += (int) Math.pow(digit,String.valueOf(temp).length());
          n/=10;

        }
        System.out.println(sum);

        return sum ==temp;

    }

}
