package ProblemSolving;

public class Recursion3 {
    public static void main(String[] args) {
        printN(1, 10);
        printN(10);
    }

    //to print numbers from 1 to N using recursion
    static void printN(int start, int end) {

        if (start >end) {
            return;
        }
        System.out.println(start);
        printN(start + 1, end);
    }

    // to print numbers from N to 1 using recursion
    static void printN(int n) {

        if(n<1){
            return ;
        }
        System.out.print(n+" ");
         printN(n-1);

    }


}
