package ProblemSolving;


//o print a message N times using recursion
public class Recursion1 {
    public static void main(String[] args) {
        nTimes(5);
    }

    static int nTimes(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println("Calling Recursive Function");
        return nTimes(n - 1);
    }

}
