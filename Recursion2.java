package ProblemSolving;

//program to print a given name N times using recursion
public class Recursion2 {
    public static void main(String[] args) {

        nTimes(5, "Man");
    }


    static int nTimes(int n, String name) {

        if (n <= 0) {
            return 0;
        }
        System.out.println("i am " + name);
        return nTimes(n - 1, name);
    }


}
