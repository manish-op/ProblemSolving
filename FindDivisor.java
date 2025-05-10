package ProblemSolving;

public class FindDivisor {
    public static void main(String[] args) {
findDivisor(10);
    }
//A divisor of a number n is an integer that divides n completely without leaving a remainder
    static void findDivisor(int num){

        System.out.println(Math.sqrt(num));
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {  //If i is a divisor of n, then n / i is also a divisor
                    System.out.print((num / i) + " ");
                }
            }
        }

    }
}
