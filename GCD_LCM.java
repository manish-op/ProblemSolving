package ProblemSolving;

public class GCD_LCM {
    public static void main(String[] args){
        System.out.println(GCD(9,18));
        System.out.println(GCD(10,100));
        System.out.println(LCM(10,100));
        System.out.println(LCM(10,20));
        System.out.println(GCD(10,20));
    }

    static int GCD(int a , int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }

    static int LCM(int a , int b){
        return a*b/GCD(a,b);
    }
}
